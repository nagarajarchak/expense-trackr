package io.thecodeproject.expensetrackr.vo.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@ToString
public class ExpenseRequest {
    private String title;
    private String description;
    private String type;
    private double amount;
    private String timestamp;
    private String comment;

}
