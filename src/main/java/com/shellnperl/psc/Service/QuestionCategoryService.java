package com.shellnperl.psc.Service;

import com.shellnperl.psc.Model.QuestionCategory;
import com.shellnperl.psc.Repository.QuestionCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Praveen's on 26-Mar-16.
 */

@Service
public class QuestionCategoryService {

    private QuestionCategoryRepository questionCategoryRepository;

    @Autowired
    public QuestionCategoryService(QuestionCategoryRepository questionCategoryRepository) {
        this.questionCategoryRepository = questionCategoryRepository;
    }

    public QuestionCategory save(QuestionCategory questionCategory){return  questionCategoryRepository.save(questionCategory);}

    public QuestionCategory getOneQuestionCategory(String id){return questionCategoryRepository.findOne(id);}

    public List<QuestionCategory>  findAllQuestionCategory(){return questionCategoryRepository.findAll();}

}
