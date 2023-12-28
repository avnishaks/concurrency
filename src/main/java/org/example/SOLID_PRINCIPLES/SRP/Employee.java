package org.example.SOLID_PRINCIPLES.SRP;
// Without SRP
public class Employee {

    private final int employee_id;

    public Employee(int id){
        this.employee_id=id;
    }

    public int getEmployeeId(){
        return employee_id;
    }

    /*
        Calculate the salary of the Employee
     */

    public double calculateSalary(){
        return 0;
    }

    /*
        Print the performance report in special format
     */

    public String printPerformanceReport(){
        return "";
    }

    public BioData retrieveBioData(){
        BioData bioData=null;
        return bioData;
    }

}