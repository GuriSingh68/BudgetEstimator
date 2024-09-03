package com.project1.budgetEstimator.service.ServiceImpl;

import com.project1.budgetEstimator.dto.Request.IncomeRequestDTO;
import com.project1.budgetEstimator.dto.ResponseDTO.IncomeResponseDTO;
import com.project1.budgetEstimator.service.IncomeService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class IncomeServiceImpl implements IncomeService {
    /**
     * @param income
     * @return
     */
    @Override
    public IncomeResponseDTO saveIncome(IncomeRequestDTO income) {
        return IncomeResponseDTO.builder()
                .Remarks("Data has been saved successfully")
                .build();
    }
}
