package com.learning.springframework.expense.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name="expense")
public class Expense {

    @Id
    private Long id;
    private Instant expensedate;
    private String descript;

    @ManyToOne // Many of these expenses can go under one category
    private Category category;
    @ManyToOne // Many expenses goes to one user.(OR One user can have many expenses)
    private User user;

}
