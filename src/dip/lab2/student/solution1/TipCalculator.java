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
public abstract class TipCalculator {
    private String serviceQuality;
    
    public enum ServiceQuality {
        GOOD, FAIR, POOR
    }
    
    public abstract void calculateTip(String serviceQuality);
}
