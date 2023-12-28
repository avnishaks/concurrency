package org.example.md_3_design_principle.SRP;

public class Employees {
    private final int emp_id;

    public Employees(int emp_id){
        this.emp_id=emp_id;
    }

    public int getEmployees(){
        return emp_id;
    }
}
