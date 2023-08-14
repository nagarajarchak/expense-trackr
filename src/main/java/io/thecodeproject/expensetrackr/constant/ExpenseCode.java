package io.thecodeproject.expensetrackr.constant;

public enum ExpenseCode {

    SUCCESS(0, "Success"),
    FAILURE(1, "Failed"),
    INVALID_INPUT_PARAMETERS(10, "Invalid input parameters"),
    REGISTER_EXPENSE_SUCCESS(1101, "Expense registration successful"),
    REGISTER_EXPENSE_FAILURE(1102, "Expense registration failed"),
    LIST_ALL_EXPENSE_SUCCESS(1103, "Expense listing successful"),
    LIST_ALL_EXPENSE_FAILURE(1104, "Expense listing failed");

    private int code;
    private String message;

    ExpenseCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
