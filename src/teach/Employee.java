//package com.jwt.core;
package teach;

public class Employee {
    private int empId;
    private String name;
    private int age;
    private float salary;

    public Employee(int empId, String name, int age, float salary) {
        this.empId = empId;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getSalary() {
        return salary;
    }
}