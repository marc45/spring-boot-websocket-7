package com.shellnperl.psc.Model;
import org.springframework.data.annotation.Id;

import java.util.Arrays;

/**
 * Created by Praveen's on 22-Mar-16.
 */
public class Question {

    @Id
    private String id;

    private String question;

    private String[] options = new String[4];

    private int rightOption;


    public String getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getOptions() {
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

    public void setOptions(String[] options) {
        this.options = options;
    }

    public void setRightOption(int rightOption) {
        this.rightOption = rightOption;
    }


    public Question(String id, String question, String[] options, int rightOption) {
        this.id = id;
        this.question = question;
        this.options = options;
        this.rightOption = rightOption;
    }

    public Question(){}



    @Override
    public String toString() {
        return "Question{" +
                "id='" + id + '\'' +
                ", question='" + question + '\'' +
                ", options=" + Arrays.toString(options) +
                ", rightOption=" + rightOption +
                '}';
    }
}
