package com.project1.budgetEstimator.repo;

import com.project1.budgetEstimator.Entity.Income;
import com.project1.budgetEstimator.dto.RequestDTO.IncomeRequestDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncomeRepository extends JpaRepository<Income,Long> {

}
