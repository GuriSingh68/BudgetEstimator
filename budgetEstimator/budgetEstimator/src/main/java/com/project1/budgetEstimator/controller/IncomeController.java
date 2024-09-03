package com.project1.budgetEstimator.controller;

import com.project1.budgetEstimator.dto.RequestDTO.IncomeRequestDTO;
import com.project1.budgetEstimator.dto.ResponseDTO.IncomeResponseDTO;
import com.project1.budgetEstimator.service.IncomeService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/v1/income")
@NoArgsConstructor
public class IncomeController {
    @Autowired
    private IncomeService incomeService;


    @PostMapping(path = "addIncome")
    public ResponseEntity<Object> addIncome(@RequestBody IncomeRequestDTO income){
        IncomeResponseDTO saveIncome = incomeService.saveIncome(income);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("Ok");
    }
}
