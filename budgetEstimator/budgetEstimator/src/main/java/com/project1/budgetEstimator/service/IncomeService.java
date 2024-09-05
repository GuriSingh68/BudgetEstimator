package com.project1.budgetEstimator.service;

import com.project1.budgetEstimator.Entity.Income;
import com.project1.budgetEstimator.dto.RequestDTO.IncomeRequestDTO;


public interface IncomeService {

    Income saveIncome(IncomeRequestDTO income);
}
