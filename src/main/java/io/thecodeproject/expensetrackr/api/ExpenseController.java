package io.thecodeproject.expensetrackr.api;

import io.thecodeproject.expensetrackr.io.request.ExpenseRequest;
import io.thecodeproject.expensetrackr.io.response.ExpenseResponse;
import io.thecodeproject.expensetrackr.io.response.ListAllExpenseResponse;
import io.thecodeproject.expensetrackr.service.ExpenseService;
import io.thecodeproject.expensetrackr.constant.RequestEndpoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(RequestEndpoint.EXPENSE_TRACKR_BASE)
public class ExpenseController {

    private static final Logger LOG = LoggerFactory.getLogger(ExpenseController.class);

    @Autowired
    private ExpenseService expenseService;

    @PostMapping(value = RequestEndpoint.REGISTER_EXPENSE)
    public ExpenseResponse registerExpense(@RequestBody ExpenseRequest expenseRequest)
    {
        LOG.info("Registering expense using request api: " + RequestEndpoint.REGISTER_EXPENSE);
        ExpenseResponse expenseResponse = new ExpenseResponse();
        expenseResponse = expenseService.registerExpense(expenseRequest, expenseResponse);
        LOG.info("Expense registration successful!");
        return expenseResponse;
    }

    @GetMapping(RequestEndpoint.LIST_ALL_EXPENSE)
    public ListAllExpenseResponse listAllExpenses()
    {
        LOG.info("Listing all expenses using request api: " + RequestEndpoint.LIST_ALL_EXPENSE);
        ListAllExpenseResponse listAllExpenseResponse = new ListAllExpenseResponse();
        listAllExpenseResponse = expenseService.listAllExpenses(listAllExpenseResponse);
        LOG.info("List all expenses successful!");
        return listAllExpenseResponse;
    }

}
