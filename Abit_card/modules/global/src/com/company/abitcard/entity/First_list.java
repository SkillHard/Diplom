package com.company.abitcard.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "ABITCARD_FIRST_LIST")
@Entity(name = "abitcard_First_list")
public class First_list extends StandardEntity {

    @Column(name = "ID_PERSON")
    protected Integer id_person;

    @Column(name = "NAME")
    protected String name;

    @Column(name = "DISCIPLIN_BALL1")
    protected Integer disciplin_ball1;

    @Column(name = "DISCIPLIN_BALL2")
    protected Integer disciplin_ball2;

    @Column(name = "DISCIPLIN_BALL3")
    protected Integer disciplin_ball3;

    @Column(name = "SUMBALL")
    protected Integer sumball;

    public Integer getSumball() {
        return sumball;
    }

    public void setSumball(Integer sumball) {
        this.sumball = sumball;
    }

    public Integer getDisciplin_ball3() {
        return disciplin_ball3;
    }

    public void setDisciplin_ball3(Integer disciplin_ball3) {
        this.disciplin_ball3 = disciplin_ball3;
    }

    public Integer getDisciplin_ball2() {
        return disciplin_ball2;
    }

    public void setDisciplin_ball2(Integer disciplin_ball2) {
        this.disciplin_ball2 = disciplin_ball2;
    }

    public Integer getDisciplin_ball1() {
        return disciplin_ball1;
    }

    public void setDisciplin_ball1(Integer disciplin_ball1) {
        this.disciplin_ball1 = disciplin_ball1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId_person() {
        return id_person;
    }

    public void setId_person(Integer id_person) {
        this.id_person = id_person;
    }
}