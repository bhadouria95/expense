package com.learning.springframework.expense.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    private String description;
    private String location;

    @ManyToOne // Many of these expenses can go under one category
    private Category category;

    @JsonIgnore // When we do not want some elements in response. We can mark them JsonIgnore.
    @ManyToOne // Many expenses goes to one user.(OR One user can have many expenses)
    private User user;

    // For some reason getter and setter created by lambok are not accessible in ExpenseController. Creating manually
    public Long getId() {
        return this.id;
    }

}
