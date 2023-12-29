package org.example.md_3_design_principle.LSP.voilation;

public class Volunteer extends Employee{
    protected Volunteer(int employeeId){
        super(employeeId);
    }
    @Override
    protected double calculateSalary() {
        throw new RuntimeException("Volunteer don't draw Salary......");
    }
}
