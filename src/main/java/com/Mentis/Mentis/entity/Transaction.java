package com.Mentis.Mentis.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "transaction")
public class Transaction {

    @Id
    private long id;

    private String concept;
    private  float amount;

    @ManyToOne
    private Employee employee;

    @ManyToOne
    private Enterprise enterprise;

    private Date createdAt;
    private  Date updatedAt;

    public Transaction() {
    }

    public Transaction(long id, String concept, float amount, Employee employee, Enterprise enterprise, Date createdAt, Date updatedAt) {
        this.id = id;
        this.concept = concept;
        this.amount = amount;
        this.employee = employee;
        this.enterprise = enterprise;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
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
