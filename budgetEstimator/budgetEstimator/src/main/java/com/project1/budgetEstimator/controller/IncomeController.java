package com.project1.budgetEstimator.controller;

import com.project1.budgetEstimator.dto.Request.incomeRequestDTO;
import com.project1.budgetEstimator.dto.ResponseDTO.IncomeResponseDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/v1/income")
public class IncomeController {
    @PostMapping(path = "addIncome")
    public ResponseEntity<Object> addIncome(@RequestBody incomeRequestDTO income){
        return ResponseEntity.ok().body(IncomeResponseDTO.builder()
                        .Remarks("Income Added Succesfully")
                .build());
    }
}
