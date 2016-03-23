package com.shellnperl.psc.Repository;

import com.shellnperl.psc.Model.Question;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Praveen's on 22-Mar-16.
 */
public interface QuestionRepository extends MongoRepository<Question,String>{


}
