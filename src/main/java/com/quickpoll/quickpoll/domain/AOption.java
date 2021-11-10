package com.quickpoll.quickpoll.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AOption {

    @Id
    @GeneratedValue
    @Column(name="`OPTION_ID`")
    private Long id;

    @Column(name="`OPTION_VALUE`")
    private String value;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}

