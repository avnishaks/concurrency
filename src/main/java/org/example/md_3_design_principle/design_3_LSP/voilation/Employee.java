package org.example.md_3_design_principle.design_3_LSP.voilation;

public abstract class Employee {

    protected final int employeeId;

    protected Employee(int employeeId){
        this.employeeId=employeeId;
    }

    protected abstract double calculateSalary();
}
