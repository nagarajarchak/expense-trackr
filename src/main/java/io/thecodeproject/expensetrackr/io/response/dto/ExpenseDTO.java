package io.thecodeproject.expensetrackr.io.response.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ExpenseDTO {

    private String title;
    private String description;
    private String type;
    private double amount;
    private String timestamp;
    private String comment;

}
