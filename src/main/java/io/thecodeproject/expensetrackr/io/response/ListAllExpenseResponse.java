package io.thecodeproject.expensetrackr.io.response;

import io.thecodeproject.expensetrackr.io.response.dto.ExpenseDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class ListAllExpenseResponse extends ExpenseResponse {

    private List<ExpenseDTO> expenses;

}
