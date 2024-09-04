package com.project1.budgetEstimator.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Data // Generates getters, setters, equals, hashCode, and toString
@Builder // Facilitates object creation
@AllArgsConstructor // Constructor with all fields
@NoArgsConstructor // Empty constructor
public class Income {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;

    private Date date;

    private String description;

    private String category;
}
