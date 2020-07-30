package com.learning.springframework.expense.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor    // we need to add no args constructor otherwise the JPA will give error.
@Entity
@Data                 // This is feature of Lambok library to automatically generate getters, setters, toString method behind the scene
@Table(name="user")
public class User {

    @Id
    private Long id;
    private String name;
    private String email;

    //    @OneToMany // One user can have many categories
    //    private Set<Category> category;

}
