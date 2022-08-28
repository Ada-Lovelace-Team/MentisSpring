package com.Mentis.Mentis.entity;


import javax.persistence.*;
import javax.xml.crypto.Data;
import java.sql.Date;

@Entity
@Table(name = "employee") // Ya que este es mapea a la BD
public class Employee {

    @Id
    private long id;

    @Column(name = "email", unique = true)
    private String email;

    @OneToOne
    private Profile profile;

    // ¿Qué relación, @OneToOne?
    private Enum_RolName rol;

    @ManyToOne  // Muchos empleados, empresa es 1
    private Enterprise enterprise; // No es instanciación, es creación un objeto, inyección de dependencias con constructor


    private Date updateAt;
    private Date createAt;

    // las Entities requieren dos constructores, uno de ellos es vacio.
    public Employee() {
    }




}
