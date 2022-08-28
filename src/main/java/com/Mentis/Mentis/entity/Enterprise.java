package com.Mentis.Mentis.entity;

import javax.persistence.*;

@Entity
public class Enterprise {

    @Id
    private long id;

    @Column( name = "name", unique = true)
    private String name;

    @Column( name = "document", unique = true)
    private String document;

    private String phone;

    private String address;

    @ManyToOne
    private Employee employee;


}
