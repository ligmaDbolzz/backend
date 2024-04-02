package com.example.backend.controller;

import com.example.backend.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.backend.service.QuestionService;
import java.util.List;

@RestController
@RequestMapping("/question")
public class questionController {
    @Autowired
    QuestionService questionService;

    @GetMapping
    public List<Question> getAllQuestions(){
        return questionService.getAllQuestions();
    }

//  add new question
    @PostMapping("/save")
    public Question saveQuestion(@RequestBody Question question){
        return questionService.saveQuestion(question);
    }

    @PostMapping("/saveAll")
    public List<Question> saveAllQuestions(@RequestBody List<Question> questions){
        return questionService.saveAllQuestions(questions);
    }

    @PostMapping("/update")
    public Question updateQuestion(@RequestBody Question question){
        return questionService.updateQuestion(question);
    }

    @DeleteMapping("/delete/{qid}")
    public String deleteQuestion(@PathVariable int qid){
        return questionService.deleteQuestion(qid);
    }
}
