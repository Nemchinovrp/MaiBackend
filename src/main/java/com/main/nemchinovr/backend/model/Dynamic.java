package com.main.nemchinovr.backend.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_count_cut")
public class Dynamic {
    @Id
    @Column
    private int id;
    @Column(name="district")
    private String district;
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
    @Column(name = "2020")
    private String six;
    @Column(name = "2021")
    private String seven;
    @Column(name = "2022")
    private String eight;

    public Dynamic() {

    }

    public Dynamic(String district, String one, String two, String three, String four, String five, String six, String seven, String eight) {
        this.district = district;
        this.one = one;
        this.two = two;
        this.three = three;
        this.four = four;
        this.five = five;
        this.six = six;
        this.seven = seven;
        this.eight = eight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
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

    public String getSix() {
        return six;
    }

    public void setSix(String six) {
        this.six = six;
    }

    public String getSeven() {
        return seven;
    }

    public void setSeven(String seven) {
        this.seven = seven;
    }

    public String getEight() {
        return eight;
    }

    public void setEight(String eight) {
        this.eight = eight;
    }
}
