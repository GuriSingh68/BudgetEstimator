package com.project1.budgetEstimator.dto.RequestDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class IncomeRequestDTO {

    private String description;
    private Double amount;
    private String category;
//    private java.sql.Date Date;
}
