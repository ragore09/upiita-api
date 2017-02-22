package com.nearsoft.upiita.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "director")
public class Director implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "origin_country")
    @Enumerated(EnumType.STRING)
    private Country originCountry;

    @Enumerated(EnumType.STRING)
    private Sex sex;

    private String name;

    public Director() {}

    public Director(String name, Country originCountry, Sex sex) {
        this.name = name;
        this.originCountry = originCountry;
        this.sex = sex;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(Country originCountry) {
        this.originCountry = originCountry;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
}
