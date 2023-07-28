package io.thecodeproject.expensetrackr.database.repository;

import io.thecodeproject.expensetrackr.database.model.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExpenseRepository extends MongoRepository<Expense, String> {

}
