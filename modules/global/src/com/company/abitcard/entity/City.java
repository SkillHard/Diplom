package com.company.abitcard.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseStringIdEntity;
import com.haulmont.cuba.core.global.DesignSupport;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NamePattern("%s|city")
@DesignSupport("{'imported':true}")
@Table(name = "city")
@Entity(name = "abitcard_City")
public class City extends BaseStringIdEntity {
    @Id
    @Column(name = "city", nullable = false)
    protected String city;

    @Override
    public void setId(String id) {
        this.city = id;
    }

    @Override
    public String getId() {
        return city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}