/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author ritu
 */
public class Startup { 
    public static void main(String[] args) {
        
        TipCalculator food = new FoodServiceTipCalculator(100.00);
        
        TipService service = new TipService(food);
        
        service.setRates(.10, .15, .20);
        System.out.println(service.calculateTip(ServiceQuality.FAIR));
        
        
    }
}
