package com.project1.budgetEstimator.service;

import com.project1.budgetEstimator.dto.Request.IncomeRequestDTO;
import com.project1.budgetEstimator.dto.ResponseDTO.IncomeResponseDTO;
import org.springframework.stereotype.Service;


public interface IncomeService {

    IncomeResponseDTO saveIncome(IncomeRequestDTO income);
}
