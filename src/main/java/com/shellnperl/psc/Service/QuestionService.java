package com.shellnperl.psc.Service;

import com.mongodb.BasicDBObject;
import com.shellnperl.psc.Model.CustomAggregationOperation;
import com.shellnperl.psc.Model.Question;
import com.shellnperl.psc.Repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.data.mongodb.core.aggregation.Aggregation.newAggregation;

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

    @Autowired
    MongoTemplate mongoTemplate;

    public Question saveQuestion(Question question){
        return questionRepository.save(question);
    }

    public Question getOneQuestion(String id){
        return questionRepository.findOne(id);
    }

    public List<Question> findAllQuestions(){
        return questionRepository.findAll();
    }

    public List<Question> randomQuiz(){

        Aggregation aggregation = newAggregation(
                new CustomAggregationOperation(
                        new BasicDBObject(
                                "$sample",
                                new BasicDBObject( "size", 10 )
                        )
                )
        );

        AggregationResults<Question> groupResults
                = mongoTemplate.aggregate(aggregation,Question.class,Question.class);
        List<Question> result = groupResults.getMappedResults();

        return result;
    }
}
