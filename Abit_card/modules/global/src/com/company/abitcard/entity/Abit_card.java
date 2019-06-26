package com.company.abitcard.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Table(name = "ABITCARD_ABIT_CARD")
@Entity(name = "abitcard_Abit_card")
public class Abit_card extends StandardEntity {
    @Column(name = "FIRSTNAME")
    protected String firstname;

    @Column(name = "SECONDNAME")
    protected String secondname;

    @Column(name = "PATRONYMIC")
    protected String patronymic;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_")
    protected Date date;

    @Column(name = "GENDER")
    protected String gender;

    @Column(name = "TRAINING_FORM")
    protected String training_form;


    @Column(name = "EDUCATION_FORM")
    protected String education_form;

    @Column(name = "NUMBER_PHONE")
    protected String number_phone;

    @Pattern(regexp = "\\S+@\\S+")
    @Column(name = "EMAIL", length = 50)
    protected String email;

    @Column(name = "FIRST_EDUCATION")
    protected String first_education;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FIRST_ID")
    protected Direction first;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SECOND_ID")
    protected Direction second;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "THIRD_ID")
    protected Direction third;

    @Column(name = "DISCIPLIN1")
    protected String disciplin1;

    @Column(name = "BALL1")
    protected Integer ball1;

    @Column(name = "DISCIPLIN2")
    protected String disciplin2;

    @Column(name = "BALL2")
    protected Integer ball2;

    @Column(name = "DISCIPLIN3")
    protected String disciplin3;

    @Column(name = "BALL3")
    protected Integer ball3;

    @Column(name = "DISCIPLIN4")
    protected String disciplin4;

    @Column(name = "BALL4")
    protected Integer ball4;

    @Column(name = "DISCIPLIN5")
    protected String disciplin5;

    @Max(message = "{msg://Количество введённых балов должно быть меньше 100}", value = 100)
    @Column(name = "BALL5")
    protected Integer ball5;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_SURRENDER")
    protected Date date_surrender;

    @Column(name = "INDIVIDUAL_ACHIEVEMENTS")
    protected String individual_achievements;

    @Column(name = "BALL6")
    protected Integer ball6;

    @Column(name = "NATION")
    protected Integer nation;

    @Column(name = "ID_DOCUMENTS")
    protected String id_documents;

    @Column(name = "SERIAS_NUMBER")
    protected String serias_number;

    @Column(name = "PLACE")
    protected String place;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_PASSPORT")
    protected Date date_passport;

    @Column(name = "COUNTRY")
    protected String country;

    @Lookup(type = LookupType.SCREEN, actions = {"clear"})
    @OnDeleteInverse(DeletePolicy.DENY)
    @OnDelete(DeletePolicy.DENY)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "REGION_REGION")
    protected Region region;

    @Lookup(type = LookupType.SCREEN, actions = {"clear"})
    @OnDeleteInverse(DeletePolicy.DENY)
    @OnDelete(DeletePolicy.DENY)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CITY_CITY")
    protected City city;

    @Lookup(type = LookupType.SCREEN, actions = {"clear"})
    @OnDeleteInverse(DeletePolicy.DENY)
    @OnDelete(DeletePolicy.DENY)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DISTRICT_DISTRICT")
    protected District district;

    @Lookup(type = LookupType.SCREEN, actions = {"clear"})
    @OnDeleteInverse(DeletePolicy.DENY)
    @OnDelete(DeletePolicy.DENY)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "STREET_STREET")
    protected Street street;

    @Column(name = "HOUSE")
    protected String house;

    @Column(name = "FLAT")
    protected String flat;

    @Column(name = "POSTINDEX", length = 6)
    protected String postindex;

    public First_education getFirst_education() {
        return first_education == null ? null : First_education.fromId(first_education);
    }

    public void setFirst_education(First_education first_education) {
        this.first_education = first_education == null ? null : first_education.getId();
    }

    public Education_form getEducation_form() {
        return education_form == null ? null : Education_form.fromId(education_form);
    }

    public void setEducation_form(Education_form education_form) {
        this.education_form = education_form == null ? null : education_form.getId();
    }

    public String getPostindex() {
        return postindex;
    }

    public void setPostindex(String postindex) {
        this.postindex = postindex;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setSerias_number(String serias_number) {
        this.serias_number = serias_number;
    }

    public String getSerias_number() {
        return serias_number;
    }


    public void setNumber_phone(String number_phone) {
        this.number_phone = number_phone;
    }

    public String getNumber_phone() {
        return number_phone;
    }

    public void setDate_surrender(Date date_surrender) {
        this.date_surrender = date_surrender;
    }

    public Date getDate_surrender() {
        return date_surrender;
    }

    public void setGender(Gender gender) {
        this.gender = gender == null ? null : gender.getId();
    }

    public Gender getGender() {
        return gender == null ? null : Gender.fromId(gender);
    }

    public void setDisciplin1(Disciplin disciplin1) {
        this.disciplin1 = disciplin1 == null ? null : disciplin1.getId();
    }

    public Disciplin getDisciplin1() {
        return disciplin1 == null ? null : Disciplin.fromId(disciplin1);
    }

    public void setDisciplin2(Disciplin disciplin2) {
        this.disciplin2 = disciplin2 == null ? null : disciplin2.getId();
    }

    public Disciplin getDisciplin2() {
        return disciplin2 == null ? null : Disciplin.fromId(disciplin2);
    }

    public void setDisciplin3(Disciplin disciplin3) {
        this.disciplin3 = disciplin3 == null ? null : disciplin3.getId();
    }

    public Disciplin getDisciplin3() {
        return disciplin3 == null ? null : Disciplin.fromId(disciplin3);
    }

    public void setDisciplin4(Disciplin disciplin4) {
        this.disciplin4 = disciplin4 == null ? null : disciplin4.getId();
    }

    public Disciplin getDisciplin4() {
        return disciplin4 == null ? null : Disciplin.fromId(disciplin4);
    }

    public void setDisciplin5(Disciplin disciplin5) {
        this.disciplin5 = disciplin5 == null ? null : disciplin5.getId();
    }

    public Disciplin getDisciplin5() {
        return disciplin5 == null ? null : Disciplin.fromId(disciplin5);
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public Street getStreet() {
        return street;
    }

    public void setStreet(Street street) {
        this.street = street;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public Integer getBall5() {
        return ball5;
    }

    public void setBall5(Integer ball5) {
        this.ball5 = ball5;
    }

    public Integer getBall6() {
        return ball6;
    }

    public void setBall6(Integer ball6) {
        this.ball6 = ball6;
    }

    public Individual_achievements getIndividual_achievements() {
        return individual_achievements == null ? null : Individual_achievements.fromId(individual_achievements);
    }

    public void setIndividual_achievements(Individual_achievements individual_achievements) {
        this.individual_achievements = individual_achievements == null ? null : individual_achievements.getId();
    }

    public Integer getBall4() {
        return ball4;
    }

    public void setBall4(Integer ball4) {
        this.ball4 = ball4;
    }

    public Integer getBall3() {
        return ball3;
    }

    public void setBall3(Integer ball3) {
        this.ball3 = ball3;
    }

    public Integer getBall2() {
        return ball2;
    }

    public void setBall2(Integer ball2) {
        this.ball2 = ball2;
    }

    public Integer getBall1() {
        return ball1;
    }

    public void setBall1(Integer ball1) {
        this.ball1 = ball1;
    }

    public void setTraining_form(Training_form training_form) {
        this.training_form = training_form == null ? null : training_form.getId();
    }

    public Training_form getTraining_form() {
        return training_form == null ? null : Training_form.fromId(training_form);
    }

    public Id_documents getId_documents() {
        return id_documents == null ? null : Id_documents.fromId(id_documents);
    }

    public void setId_documents(Id_documents id_documents) {
        this.id_documents = id_documents == null ? null : id_documents.getId();
    }

    public Nation getNation() {
        return nation == null ? null : Nation.fromId(nation);
    }

    public void setNation(Nation nation) {
        this.nation = nation == null ? null : nation.getId();
    }

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public Date getDate_passport() {
        return date_passport;
    }

    public void setDate_passport(Date date_passport) {
        this.date_passport = date_passport;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

}