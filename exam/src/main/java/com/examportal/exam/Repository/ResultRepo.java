package com.examportal.exam.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examportal.exam.Model.User;
import com.examportal.exam.Model.Exams.Quiz;
import com.examportal.exam.Model.Exams.Result;

public interface ResultRepo extends JpaRepository<Result,Integer>{

    List<Result> findByQuiz(Quiz quiz);

	List<Result> findByUser(User user);

	List<Result> findByQuizAndUser(Quiz quiz, User user);
    
}
