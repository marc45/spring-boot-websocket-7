package com.shellnperl.psc.Repository;

import com.shellnperl.psc.Model.QuestionCategory;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Praveen's on 26-Mar-16.
 */
public interface QuestionCategoryRepository extends MongoRepository<QuestionCategory,String> {
}
