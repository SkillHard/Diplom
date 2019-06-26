package com.company.abitcard.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@Table(name = "ABITCARD_CONNECTION")
@Entity(name = "abitcard_Connection")
public class Connection extends StandardEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FIRST_ID")
    protected Direction first;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SECOND_ID")
    protected Direction second;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "THIRD_ID")
    protected Direction third;

    public Direction getThird() {
        return third;
    }

    public void setThird(Direction third) {
        this.third = third;
    }

    public Direction getSecond() {
        return second;
    }

    public void setSecond(Direction second) {
        this.second = second;
    }

    public Direction getFirst() {
        return first;
    }

    public void setFirst(Direction first) {
        this.first = first;
    }
}