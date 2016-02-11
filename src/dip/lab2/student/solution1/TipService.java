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
public class TipService{
    
    private TipCalculator calc;
    
    public TipService(TipCalculator calc) {
        this.calc = calc;
    }
    
    public double calculateTip(ServiceQuality serviceQuality) {
        double tip = calc.calculateTip(serviceQuality);
        return tip;
    }
    
    public void setRates(double GOOD_RATE, double FAIR_RATE, double POOR_RATE){
        calc.setRates(GOOD_RATE, FAIR_RATE, POOR_RATE);
    }
    
    
}
