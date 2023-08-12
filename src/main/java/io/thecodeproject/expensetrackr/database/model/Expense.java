package io.thecodeproject.expensetrackr.database.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@ToString
@Document(collection = "Expense")
public class Expense {

    @Id
    private String id;

    @Field("Title")
    private String title;

    @Field("Description")
    private String description;

    @Field("Type")
    private String type;

    @Field("Amount")
    private double amount;

    @Field("Timestamp")
    private String timestamp;

    @Field("Comment")
    private String comment;

}
