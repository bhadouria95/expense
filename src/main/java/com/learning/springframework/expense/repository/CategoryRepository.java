package com.learning.springframework.expense.repository;

import com.learning.springframework.expense.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    // findBy + field-name: this is JPA presentation, here we use field-name with 1st letter uppercase. Ex: findBy + Name.
    Category findByName(String name);
}
