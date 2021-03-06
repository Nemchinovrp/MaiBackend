package com.main.nemchinovr.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "resume_vacancy")
public class Resume {
    @Id
    @Column
    private int id;
    @Column(name = "category")
    private String category;
    @Column(name = "2015")
    private String one;
    @Column(name = "2016")
    private String two;
    @Column(name = "2017")
    private String three;
    @Column(name = "2018")
    private String four;
    @Column(name = "2019")
    private String five;


    public Resume() {
    }

    public Resume(String category, String one, String two, String three, String four, String five) {
        this.category = category;
        this.one = one;
        this.two = two;
        this.three = three;
        this.four = four;
        this.five = five;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getOne() {
        return one;
    }

    public void setOne(String one) {
        this.one = one;
    }

    public String getTwo() {
        return two;
    }

    public void setTwo(String two) {
        this.two = two;
    }

    public String getThree() {
        return three;
    }

    public void setThree(String three) {
        this.three = three;
    }

    public String getFour() {
        return four;
    }

    public void setFour(String four) {
        this.four = four;
    }

    public String getFive() {
        return five;
    }

    public void setFive(String five) {
        this.five = five;
    }
}
