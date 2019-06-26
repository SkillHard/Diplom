package com.company.abitcard.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseStringIdEntity;
import com.haulmont.cuba.core.global.DesignSupport;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NamePattern("%s|street")
@DesignSupport("{'imported':true}")
@Table(name = "street")
@Entity(name = "abitcard_Street")
public class Street extends BaseStringIdEntity {
    @Id
    @Column(name = "street", nullable = false)
    protected String street;

    @Override
    public void setId(String id) {
        this.street = id;
    }

    @Override
    public String getId() {
        return street;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}