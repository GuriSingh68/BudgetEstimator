package com.project1.budgetEstimator.service.ServiceImpl;

import com.project1.budgetEstimator.Entity.Income;
import com.project1.budgetEstimator.dto.RequestDTO.IncomeRequestDTO;
import com.project1.budgetEstimator.repo.IncomeRepository;
import com.project1.budgetEstimator.service.IncomeService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;

import java.sql.Date;

@AllArgsConstructor
@Service
@NoArgsConstructor
public class IncomeServiceImpl implements IncomeService {
    @Autowired
    private  IncomeRepository incomeRepository;


    /**
     * @param income
     * @return
     */
    @Override
    public Income saveIncome(IncomeRequestDTO income) {
        Income addingIncome=new Income();
        addingIncome.setAmount(income.getAmount());
        addingIncome.setCategory(income.getCategory());
        addingIncome.setDate(new Date(System.currentTimeMillis()));
        addingIncome.setDescription(income.getDescription());
        return incomeRepository.save(addingIncome);
    }
}
