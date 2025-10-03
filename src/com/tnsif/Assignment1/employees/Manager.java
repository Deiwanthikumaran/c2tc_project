package com.tnsif.Assignment1.employees;

/**
 * The Manager class extends Employee and adds a department attribute.
 */
public class Manager extends Employee {
    private String department;

    public Manager(String name, int employeeId, double salary, String department) {
        super(name, employeeId, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Manager [Name=" + getName() + ", ID=" + getEmployeeId() + 
               ", Salary=" + getSalary() + ", Department=" + department + "]";
    }
}
