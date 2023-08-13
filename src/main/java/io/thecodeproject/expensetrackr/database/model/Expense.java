package io.thecodeproject.expensetrackr.database.model;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Document(collection = "Expense")
public class Expense
{

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

    public Expense(ExpenseBuilder expenseBuilder) {
        this.id = expenseBuilder.id;
        this.title = expenseBuilder.title;
        this.description = expenseBuilder.description;
        this.type = expenseBuilder.type;
        this.amount = expenseBuilder.amount;
        this.timestamp = expenseBuilder.timestamp;
        this.comment = expenseBuilder.comment;
    }

    public static class ExpenseBuilder
    {
        private String id;
        private String title;
        private String description;
        private String type;
        private double amount;
        private String timestamp;
        private String comment;

        public ExpenseBuilder(String title, String description, String type, double amount, String timestamp) {
            this.title = title;
            this.description = description;
            this.type = type;
            this.amount = amount;
            this.timestamp = timestamp;
        }

        public ExpenseBuilder setComment(String comment) {
            this.comment = comment;
            return this;
        }

        public Expense build()
        {
            return new Expense(this);
        }
    }

}
