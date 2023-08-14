package io.thecodeproject.expensetrackr.service;

import io.thecodeproject.expensetrackr.builder.ExpenseDomain;
import io.thecodeproject.expensetrackr.constant.ExpenseCode;
import io.thecodeproject.expensetrackr.database.model.Expense;
import io.thecodeproject.expensetrackr.database.repository.ExpenseRepository;

import io.thecodeproject.expensetrackr.io.request.ExpenseRequest;
import io.thecodeproject.expensetrackr.io.response.ExpenseResponse;
import io.thecodeproject.expensetrackr.io.response.ListAllExpenseResponse;
import io.thecodeproject.expensetrackr.io.response.dto.ExpenseDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ExpenseService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ExpenseRepository expenseRepository;

    public ExpenseResponse registerExpense(ExpenseRequest expenseRequest, ExpenseResponse expenseResponse)
    {
        // TODO: Move validations to a common helper / validation package
        if(expenseRequest.getTitle() == null)
        {
            expenseResponse.addErrorAPIResponse(ExpenseCode.INVALID_INPUT_PARAMETERS.getCode(), ExpenseCode.INVALID_INPUT_PARAMETERS.getMessage());
            expenseResponse.setResult(ExpenseCode.REGISTER_EXPENSE_FAILURE.getCode(), ExpenseCode.REGISTER_EXPENSE_FAILURE.getMessage());
            return expenseResponse;
        }

        ExpenseDomain.ExpenseBuilder expenseBuilder = new ExpenseDomain.ExpenseBuilder(
                expenseRequest.getTitle(),
                expenseRequest.getDescription(),
                expenseRequest.getType(),
                expenseRequest.getAmount(),
                expenseRequest.getTimestamp()
        );

        if(expenseRequest.getComment() != null)
            expenseBuilder.setComment(expenseRequest.getComment());

        ExpenseDomain expenseDomain = expenseBuilder.build();
        Expense expense = modelMapper.map(expenseDomain, Expense.class);
        expenseRepository.save(expense);

        expenseResponse.setResult(ExpenseCode.REGISTER_EXPENSE_SUCCESS.getCode(), ExpenseCode.REGISTER_EXPENSE_SUCCESS.getMessage());
        return expenseResponse;
    }

    public ListAllExpenseResponse listAllExpenses(ListAllExpenseResponse listAllExpenseResponse)
    {
        ArrayList<ExpenseDTO> expensesResponse = new ArrayList<>();
        for(Expense expense : expenseRepository.findAll())
            expensesResponse.add(modelMapper.map(expense, ExpenseDTO.class));

        listAllExpenseResponse.setExpenses(expensesResponse);
        listAllExpenseResponse.setResult(ExpenseCode.LIST_ALL_EXPENSE_SUCCESS.getCode(), ExpenseCode.LIST_ALL_EXPENSE_SUCCESS.getMessage());
        return listAllExpenseResponse;

    }

}
