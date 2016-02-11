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
        
        TipService service = new TipService(10.00, 15.00, 20.00);
        TipCalculator calculators[] = {new FoodServiceTipCalculator(), new BaggageServiceTipCalculator()};
        
        for (TipCalculator calc: calculators){
            service.calculateTip(calc, ServiceQuality.FAIR);
        }
        
        
    }
}
