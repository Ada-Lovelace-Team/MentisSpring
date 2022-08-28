package com.Mentis.Mentis.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;

@Entity
@Table(name = "enterprise")
public class Enterprise {

    @Id
    private long id;

    @Column( name = "name", unique = true)
    private String name;

    @Column( name = "document", unique = true)
    private String document;

    private String phone;

    private String address;

    @OneToMany
    private ArrayList<Employee> employees;

    @OneToMany
    private ArrayList<Transaction> transactions;

    private Date createdAt;
    private Date updatedAt;

    public Enterprise() {
    }

    public Enterprise(long id, String name, String document, String phone, String address, ArrayList<Employee> employees, ArrayList<Transaction> transactions, Date createdAt, Date updatedAt) {
        this.id = id;
        this.name = name;
        this.document = document;
        this.phone = phone;
        this.address = address;
        this.employees = employees;
        this.transactions = transactions;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
