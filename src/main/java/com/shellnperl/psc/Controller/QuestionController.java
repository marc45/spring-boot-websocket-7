package com.shellnperl.psc.Controller;

import com.shellnperl.psc.Model.Question;
import com.shellnperl.psc.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Praveen's on 23-Mar-16.
 */


@RestController
@RequestMapping(value="/api")
public class QuestionController {

    private QuestionService questionService;

    @Autowired
    public QuestionController(QuestionService questionService){
        this.questionService =questionService;
    }

    @RequestMapping(value = "/questions", method = RequestMethod.POST)
    public Question saveQuestion(@RequestBody Question question) {
        return questionService.saveQuestion(question);
    }


    @RequestMapping(value = "/questions/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Question getOneQuestion(@PathVariable String id) {
        return questionService.getOneQuestion(id);
    }

    @RequestMapping(value = "/questions", method = RequestMethod.GET)
    public List<Question> findAllQuestions(){
        return questionService.findAllQuestions();
    }
}
