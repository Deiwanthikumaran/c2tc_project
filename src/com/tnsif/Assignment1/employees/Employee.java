package com.tnsif.Assignment1.employees;

public class Employee {
    private String name;       // private → only accessible in this class
    private int employeeId;    // private → encapsulation
    private double salary;     // private → encapsulation

    // Constructor
    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Public Getters and Setters (Encapsulation)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    protected double getSalary() {  // protected → accessible in subclasses
        return salary;
    }

    protected void setSalary(double salary) {  // protected → subclasses/utilities can modify
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [Name=" + name + ", ID=" + employeeId + ", Salary=" + salary + "]";
    }
}
