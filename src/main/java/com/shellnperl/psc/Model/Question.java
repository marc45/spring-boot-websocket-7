package com.shellnperl.psc.Model;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Praveen's on 22-Mar-16.
 */
public class Question {

    @Id
    private String id;

    private String question;

    private ArrayList options = new ArrayList(4);

    private int rightOption;

    private ArrayList Categories = new ArrayList();

    public ArrayList getCategories() {
        return Categories;
    }

    public void setCategories(ArrayList categories) {
        Categories = categories;
    }

    public String getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public ArrayList getOptions() {
        return options;
    }

    public int getRightOption() {
        return rightOption;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setOptions(ArrayList options) {
        this.options = options;
    }

    public void setRightOption(int rightOption) {
        this.rightOption = rightOption;
    }


    public Question(String id, String question, ArrayList options, int rightOption, ArrayList categories) {
        this.id = id;
        this.question = question;
        this.options = options;
        this.rightOption = rightOption;
        Categories = categories;
    }

    public Question(){}


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
