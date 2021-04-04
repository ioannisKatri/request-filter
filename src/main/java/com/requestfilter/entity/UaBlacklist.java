package com.requestfilter.entity;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ua_blacklist")
public class UaBlacklist {

    @Id
    @NotNull
    @Column(name="ua")
    private String ua ;


}
