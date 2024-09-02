package com.project1.budgetEstimator.dto.Request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import java.sql.Date;

@Data
@Builder
@AllArgsConstructor
public class incomeRequestDTO {

    private String Id;
    private String income;
//    private java.sql.Date Date;
}
