package com.project1.budgetEstimator.service;

import com.project1.budgetEstimator.dto.RequestDTO.IncomeRequestDTO;
import com.project1.budgetEstimator.dto.ResponseDTO.IncomeResponseDTO;


public interface IncomeService {

    IncomeResponseDTO saveIncome(IncomeRequestDTO income);
}
