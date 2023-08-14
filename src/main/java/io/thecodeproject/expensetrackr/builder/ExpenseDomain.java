package io.thecodeproject.expensetrackr.builder;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ExpenseDomain {

    private String id;
    private String title;
    private String description;
    private String type;
    private double amount;
    private String timestamp;
    private String comment;

    public ExpenseDomain(ExpenseBuilder expenseBuilder) {
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

        public ExpenseDomain build()
        {
            return new ExpenseDomain(this);
        }
    }

}
