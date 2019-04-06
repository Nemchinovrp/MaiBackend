package com.main.nemchinovr.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;
import java.util.Objects;

@Entity
@Table(name = "vacancy")
public class Vacancy {
    @Id
    @Column
    private int id;
    @Column
    private String experience;
    @Column
    private String name;
    @Column
    private BigInteger salary;
    @Column
    private String specialization;
    @Column
    private String title;

    public Vacancy(){}

    public Vacancy(String experience, String name, BigInteger salary, String specialization, String title) {
        this.experience = experience;
        this.name = name;
        this.salary = salary;
        this.specialization = specialization;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigInteger getSalary() {
        return salary;
    }

    public void setSalary(BigInteger salary) {
        this.salary = salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vacancy vacancy = (Vacancy) o;
        return id == vacancy.id &&
                Objects.equals(experience, vacancy.experience) &&
                Objects.equals(name, vacancy.name) &&
                Objects.equals(salary, vacancy.salary) &&
                Objects.equals(specialization, vacancy.specialization) &&
                Objects.equals(title, vacancy.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, experience, name, salary, specialization, title);
    }
}
