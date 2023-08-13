package io.thecodeproject.expensetrackr;

import io.thecodeproject.expensetrackr.database.model.Expense;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExpenseTrackrApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpenseTrackrApplication.class, args);
	}

}
