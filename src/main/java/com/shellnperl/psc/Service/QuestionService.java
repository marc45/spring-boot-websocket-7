package com.shellnperl.psc.Service;

import com.shellnperl.psc.Model.Question;
import com.shellnperl.psc.Repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Praveen's on 22-Mar-16.
 */
@Service
public class QuestionService {

    private QuestionRepository questionRepository;

    @Autowired
    public QuestionService(QuestionRepository questionRepository){
        this.questionRepository = questionRepository;
    }

    public Question saveQuestion(Question question){
        return questionRepository.save(question);
    }

    public Question getOneQuestion(String id){
        return questionRepository.findOne(id);
    }

    public List<Question> findAllQuestions(){
        return questionRepository.findAll();
    }
}
