/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab1.student.solution1;

/**
 *
 * @author ritu
 */
public class Startup {
    Employee emp1 = new HourlyEmployee();
    Employee emp2 = new SalariedEmployee();
    Employee emp3 = new SalariedEmployee();
    
    HRService hr = new HRService();
    
    Employee[] listofemployees = {emp1, emp2, emp3};
    
    for(Employee e: listofemployees){
        hr.getAnnualCompensationForEmployee(e);
    }
    
}
