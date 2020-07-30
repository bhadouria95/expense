package com.learning.springframework.expense.model;


import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
@Table(name="category")
public class Category {

    @Id
    private Long id;

    @NonNull
    private String name;

    // For some reason getter and setter created by lambok are not accessible in CategoryController. Creating manually
    public Long getId() {
        return this.id;
    }

}
