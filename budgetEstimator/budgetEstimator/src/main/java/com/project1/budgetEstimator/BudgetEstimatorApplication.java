package com.project1.budgetEstimator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class BudgetEstimatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(BudgetEstimatorApplication.class, args);
	}

}
