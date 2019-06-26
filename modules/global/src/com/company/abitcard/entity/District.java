package com.company.abitcard.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseStringIdEntity;
import com.haulmont.cuba.core.global.DesignSupport;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NamePattern("%s|district")
@DesignSupport("{'imported':true}")
@Table(name = "district")
@Entity(name = "abitcard_District")
public class District extends BaseStringIdEntity {
    @Id
    @Column(name = "district", nullable = false)
    protected String district;

    @Override
    public void setId(String id) {
        this.district = id;
    }

    @Override
    public String getId() {
        return district;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
}