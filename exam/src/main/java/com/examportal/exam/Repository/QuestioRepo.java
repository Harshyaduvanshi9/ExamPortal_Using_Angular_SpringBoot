package com.examportal.exam.Repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examportal.exam.Model.Exams.Question;
import com.examportal.exam.Model.Exams.Quiz;

public interface QuestioRepo extends JpaRepository<Question,Long>{
     Set<Question> findByQuiz(Quiz quiz);
    
}
