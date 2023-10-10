package com.examportal.exam.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examportal.exam.Model.Exams.Category;

public interface CategoryRepo extends JpaRepository<Category,Long> {
    
}
