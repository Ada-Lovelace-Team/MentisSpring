package com.Mentis.Mentis.entity;


import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;

@Entity
@Table(name = "employee") // Ya que este es mapea a la BD
public class Employee {

    @Id
    private long id;

    @Column(name = "email", unique = true)
    private String email;

    @OneToOne
    private Profile profile;

    // ¿Qué relación, @OneToOne
    private Enum_RolName rol;

    @ManyToOne  // Muchos empleados tienen 1 empresa
    private Enterprise enterprise; // No es instanciación, es creación un objeto, inyección de dependencias con constructor

    @OneToMany
    private ArrayList<Transaction> transactions;

    private Date updateAt;
    private Date createAt;

    public Employee() {
    }

    public Employee(long id, String email, Profile profile, Enum_RolName rol, Enterprise enterprise, ArrayList<Transaction> transactions, Date updateAt, Date createAt) {
        this.id = id;
        this.email = email;
        this.profile = profile;
        this.rol = rol;
        this.enterprise = enterprise;
        this.transactions = transactions;
        this.updateAt = updateAt;
        this.createAt = createAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Enum_RolName getRol() {
        return rol;
    }

    public void setRol(Enum_RolName rol) {
        this.rol = rol;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}
