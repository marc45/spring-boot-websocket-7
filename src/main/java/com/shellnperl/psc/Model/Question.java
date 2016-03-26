package com.shellnperl.psc.Model;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;


/**
 * Created by Praveen's on 22-Mar-16.
 */
public class Question {

    @Id
    private String id;

    private String question;

    private ArrayList<String> options;


    private int rightOption;

    private ArrayList<QuestionCategory> Categories ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<String> options) {
        this.options = options;
    }

    public int getRightOption() {
        return rightOption;
    }

    public void setRightOption(int rightOption) {
        this.rightOption = rightOption;
    }

    public ArrayList<QuestionCategory> getCategories() {
        return Categories;
    }

    public void setCategories(ArrayList<QuestionCategory> categories) {
        Categories = categories;
    }

    public Question(){}

    public Question(String question, ArrayList<String> options, int rightOption, ArrayList<QuestionCategory> categories) {
        this.question = question;
        this.options = options;
        this.rightOption = rightOption;
        Categories = categories;
    }


    @Override
    public String toString() {
        return "Question{" +
                "id='" + id + '\'' +
                ", question='" + question + '\'' +
                ", options=" + options +
                ", rightOption=" + rightOption +
                ", Categories=" + Categories +
                '}';
    }
}
