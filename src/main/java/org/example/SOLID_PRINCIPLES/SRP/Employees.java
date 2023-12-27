package org.example.SOLID_PRINCIPLES.SRP;

public class Employees {
    private final int emp_id;

    public Employees(int emp_id){
        this.emp_id=emp_id;
    }

    public int getEmployees(){
        return emp_id;
    }
}
