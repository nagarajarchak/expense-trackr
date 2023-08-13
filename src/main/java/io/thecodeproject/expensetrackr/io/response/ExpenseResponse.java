package io.thecodeproject.expensetrackr.io.response;

import io.thecodeproject.expensetrackr.io.response.generic.ApiStatus;
import io.thecodeproject.expensetrackr.io.response.generic.Result;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ExpenseResponse {

    private ApiStatus apiStatus;
    private Result result;

    private String id;
    private String title;
    private String description;
    private String type;
    private double amount;
    private String timestamp;
    private String comment;

}
