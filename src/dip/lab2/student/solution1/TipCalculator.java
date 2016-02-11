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
public interface TipCalculator {
    
    public abstract double calculateTip(ServiceQuality serviceQuality);
    public abstract void setRates(double GOOD_RATE, double FAIR_RATE, double POOR_RATE);
    
}
