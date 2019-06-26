package com.company.abitcard.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseStringIdEntity;
import com.haulmont.cuba.core.global.DesignSupport;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NamePattern("%s|region")
@DesignSupport("{'imported':true}")
@Table(name = "region")
@Entity(name = "abitcard_Region")
public class Region extends BaseStringIdEntity {
    @Id
    @Column(name = "region", nullable = false)
    protected String region;

    @Override
    public void setId(String id) {
        this.region = id;
    }

    @Override
    public String getId() {
        return region;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}