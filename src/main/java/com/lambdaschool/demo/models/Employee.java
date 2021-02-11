package com.lambdaschool.demo.models;

import javax.persistence.*;

//this class is now a bean -Entity
//Beans are things that are managed by spring through a class annotation
//Otherwise normal java classes are POJOs... Plain Old Java Objects
@Entity
@Table(name = "employees")
public class Employee
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long empid;
    private String fname;
    private String lname;
    private double salary;

    public Employee()
    {
        //Spring Data JPA required empty constructor
    }

    public Employee(String fname, String lname, double salary)
    {
        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
    }

    //getters and setters

    public long getEmpid() {
        return empid;
    }

    public void setEmpid(long empid) {
        this.empid = empid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
