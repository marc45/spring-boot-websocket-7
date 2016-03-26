package com.shellnperl.psc.Model;

import org.springframework.data.annotation.Id;

/**
 * Created by Praveen's on 26-Mar-16.
 */
public class QuestionCategory {

    @Id
    private  String id;

    private  String name;

    private String description;


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public QuestionCategory(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public QuestionCategory(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public  QuestionCategory(){}

    @Override
    public String toString() {
        return "QuestionCategory{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
