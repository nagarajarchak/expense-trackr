package io.thecodeproject.expensetrackr.api;

import io.thecodeproject.expensetrackr.service.ExpenseService;
import io.thecodeproject.expensetrackr.constant.RequestConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RequestConstant.EXPENSE_BASE)
public class ExpenseController {

    private static final Logger LOG = LoggerFactory.getLogger(ExpenseController.class);

    @Autowired
    private ExpenseService expenseService;

    @PostMapping("/new")
    public void registerExpense()
    {
        expenseService.registerExpense();
    }

}
