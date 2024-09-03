package com.project1.budgetEstimator.repo;

import com.project1.budgetEstimator.dto.Request.IncomeRequestDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncomeRepository extends JpaRepository<IncomeRequestDTO,Long> {

}
