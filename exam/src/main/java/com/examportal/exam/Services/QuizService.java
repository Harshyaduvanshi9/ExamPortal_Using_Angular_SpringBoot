package com.examportal.exam.Services;

import java.util.List;
import java.util.Set;

import com.examportal.exam.Model.Exams.Category;
import com.examportal.exam.Model.Exams.Quiz;

public interface QuizService {
       public Quiz addQuiz(Quiz quiz);
    public Quiz updateQuiz(Quiz quiz);
    public Set<Quiz> getQuizzes();
    public  Quiz getQuiz(Long quizId);
    public  void  deleteQuiz(Long quizId);
	public List<Quiz> getQuizzesOfCategory(Category cat);
    
}
