package com.examportal.exam.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examportal.exam.Model.Exams.Category;
import com.examportal.exam.Model.Exams.Quiz;

public interface QuizRepo extends JpaRepository<Quiz,Long>{

    List<Quiz> findByCategory(Category category);
    
}
