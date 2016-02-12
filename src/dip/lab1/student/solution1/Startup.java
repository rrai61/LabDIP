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
    public static void main (String[] args){
        
        HRService hr = new HRService();

        Employee[] listofemployees = {new HourlyEmployee(12.00, 130), new SalariedEmployee(20000, 500)};

        for(Employee e: listofemployees){
            System.out.println(hr.getAnnualCompensationForEmployee(e));
        }
    }
}
