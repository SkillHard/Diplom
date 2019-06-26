package com.company.abitcard.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NamePattern("%s %s %s   |direction,shifr,faculty")
@Table(name = "ABITCARD_FIRST_DIRECTION")
@Entity(name = "abitcard_First_direction")
public class First_direction extends StandardEntity {
    @Column(name = "SHIFR")
    protected String shifr;

    @Column(name = "FACULTY")
    protected String faculty;

    @Column(name = "DIRECTION")
    protected String direction;

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getShifr() {
        return shifr;
    }

    public void setShifr(String shifr) {
        this.shifr = shifr;
    }
}