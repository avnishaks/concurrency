package org.example.md_3_design_principle.LSP.voilation;

import java.util.List;

public class SalaryDisburser {

    public void disburseSalary(List<Employee> emp){
        for(int i=0;i<emp.size();i++){
            Employee e=emp.get(i);
            if(e instanceof Volunteer){
                continue;
            }
            e.calculateSalary();
        }

    }
}
