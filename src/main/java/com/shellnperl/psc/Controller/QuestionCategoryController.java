package com.shellnperl.psc.Controller;

import com.shellnperl.psc.Model.QuestionCategory;
import com.shellnperl.psc.Service.QuestionCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Praveen's on 26-Mar-16.
 */

@RestController
@RequestMapping(value="/api")
public class QuestionCategoryController {

    private QuestionCategoryService questionCategoryService;

    @Autowired
    public QuestionCategoryController(QuestionCategoryService questionCategoryService) {
        this.questionCategoryService = questionCategoryService;
    }

    @RequestMapping(value = "/questioncategory", method = RequestMethod.POST)
    public QuestionCategory saveQuestionCategory(@RequestBody QuestionCategory questionCategory){ return  questionCategoryService.save(questionCategory);}

    @RequestMapping(value = "/questioncategory/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public  QuestionCategory getOneQuestionCategory(@PathVariable String id){ return questionCategoryService.getOneQuestionCategory(id);}

    @RequestMapping(value = "/questioncategory", method = RequestMethod.GET)
    public List<QuestionCategory> findAllQuestionCategory(){return  questionCategoryService.findAllQuestionCategory();}

}
