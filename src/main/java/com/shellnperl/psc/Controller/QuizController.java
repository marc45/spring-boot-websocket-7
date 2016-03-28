package com.shellnperl.psc.Controller;

import com.shellnperl.psc.Model.Question;
import com.shellnperl.psc.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Praveen's on 25-Mar-16.
 */

@RestController
public class QuizController {

    private QuestionService questionService;

    @Autowired
    public QuizController(QuestionService questionService){
        this.questionService =questionService;
    }

    @RequestMapping(value = "/quiz", method = RequestMethod.GET)
    public List<Question> randomQuiz(){
        return questionService.randomQuiz();
    }

    @RequestMapping(value = "/quizbycategory/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Question> findByCategoryId(@PathVariable String id) {return questionService.findByCategoryId(id);}

    @RequestMapping(value = "/randomquizbycategory/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Question> randomQuizByCategory(@PathVariable String id) {return questionService.randomQuizByCategory(id);}


}
