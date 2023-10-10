package com.examportal.exam.Services;

import java.util.List;

import com.examportal.exam.Model.User;
import com.examportal.exam.Model.Exams.Quiz;
import com.examportal.exam.Model.Exams.Result;

public interface ResultService {
    public Result addResult(Result result);
	public List<Result> getAllResult();
	public List<Result> getResultOfQuiz(Quiz quiz);
	public List<Result> getResultOfUser(User user);
	public List<Result> getResultOfUserAndQuiz(Quiz quiz,User user);
    
}
