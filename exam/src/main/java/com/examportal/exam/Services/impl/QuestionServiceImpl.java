package com.examportal.exam.Services.impl;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examportal.exam.Model.Exams.Question;
import com.examportal.exam.Model.Exams.Quiz;
import com.examportal.exam.Repository.QuestioRepo;
// import com.examportal.exam.Repository.QuizRepo;
import com.examportal.exam.Services.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {
    
    @Autowired
    private QuestioRepo questionRepository;

    @Override
    public Question addQuestion(Question question) {
        return this.questionRepository.save(question);
    }

    @Override
    public Question updateQuestion(Question question) {
        return this.questionRepository.save(question);
    }

    @Override
    public Set<Question> getQuestions() {
        return new LinkedHashSet<>(this.questionRepository.findAll());
    }

    @Override
    public Question getQuestion(Long questionId) {
        return this.questionRepository.findById(questionId).get();
    }

    @Override
    public Set<Question> getQuestionOfQuiz(Quiz quiz) {
        return this.questionRepository.findByQuiz(quiz);
    }

    @Override
    public void deleteQuestion(Long qid) {
        this.questionRepository.deleteById(qid);
    }
    
}
