package com.examportal.exam.Controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examportal.exam.Model.Exams.Question;
import com.examportal.exam.Model.Exams.Quiz;
import com.examportal.exam.Services.QuestionService;
import com.examportal.exam.Services.QuizService;

@RestController
@RequestMapping("/question")
@CrossOrigin("*")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @Autowired
    private QuizService quizService;

    

    @PostMapping("/")
    public ResponseEntity<?> addQuestion(@RequestBody Question question)
    {
    	System.out.println("hidifjsidho");
    	System.out.println(question);
        return ResponseEntity.ok(this.questionService.addQuestion(question));
    }

   
    @PutMapping("/")
    public ResponseEntity<?> updateQuestion(@RequestBody Question question)
    {
        return ResponseEntity.ok(this.questionService.updateQuestion(question));
    }

    
    @GetMapping("/quiz/{qid}")
    public ResponseEntity<?> getAllQuestionsOfQuiz(@PathVariable("qid") Long qid)
    {
        Quiz quiz=this.quizService.getQuiz(qid);
        Set<Question> questions=quiz.getQuestions();
        int totalQuestions=Integer.parseInt(quiz.getNoOfQuestions());
        List<Question> list = new ArrayList<>(questions);
        if(list.size()>totalQuestions)
        {
            list=list.subList(0,totalQuestions+1);
        }
        Collections.shuffle(list);
        return ResponseEntity.ok(list);
    }
    @GetMapping("/quiz/all/{qid}")
    public ResponseEntity<?> getAllQuestionsOfQuizAdmin(@PathVariable("qid") Long qid)
    {
      Quiz quiz=new Quiz();
      quiz.setQid(qid);
      Set<Question>list=this.questionService.getQuestionOfQuiz(quiz);

        return ResponseEntity.ok(list);
    }

    
    @GetMapping("/{qid}")
    public Question getQuestion(@PathVariable("qid") Long qid)
    {
        return this.questionService.getQuestion(qid);
    }
    //delete a single question
    @DeleteMapping("{qid}")
    public void deleteQuestion(@PathVariable("qid") Long qid)
    {
        this.questionService.deleteQuestion(qid);
    }

}

