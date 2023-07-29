package io.thecodeproject.expensetrackr.vo.request;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

public class ExpenseRequest {
    private String title;
    private String description;
    private String type;
    private double amount;
    private String timestamp;
    private String comment;

}
