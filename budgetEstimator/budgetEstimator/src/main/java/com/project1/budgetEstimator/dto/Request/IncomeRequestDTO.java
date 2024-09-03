package com.project1.budgetEstimator.dto.Request;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@Getter
@Setter
public class IncomeRequestDTO {

    private String Id;
    private String income;
//    private java.sql.Date Date;
}
