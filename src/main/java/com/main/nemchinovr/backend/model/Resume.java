package com.main.nemchinovr.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;
import java.util.Objects;

@Entity
@Table(name = "resume")
public class Resume {
    @Id
    @Column
    private int id;
    @Column
    private int experience;
    @Column
    private String name;
    @Column
    private BigInteger salary;
    @Column
    private String specialization;
    @Column
    private String title;

    public Resume() {}

    public Resume(int experience, String name, BigInteger salary, String specialization, String title) {
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

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
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
        Resume resume = (Resume) o;
        return id == resume.id &&
                experience == resume.experience &&
                Objects.equals(name, resume.name) &&
                Objects.equals(salary, resume.salary) &&
                Objects.equals(specialization, resume.specialization) &&
                Objects.equals(title, resume.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, experience, name, salary, specialization, title);
    }
}
