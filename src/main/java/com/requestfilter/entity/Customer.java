package com.requestfilter.entity;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @NotNull
    @Column(name = "id")
    private Integer id;

    @NotNull
    @Column(name = "name")
    private String name;

    @NotNull
    @Column(name = "active")
    private boolean active;

    public Customer() {
    }

    public Customer(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return active;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", active=" + active +
                '}';
    }
}
