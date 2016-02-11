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
    
    private double GOOD_RATE;
    private double FAIR_RATE;
    private double POOR_RATE;
    
    public TipService() {
        
    }
    
    public TipService(double GOOD_RATE, double FAIR_RATE, double POOR_RATE) {
        setGOOD_RATE(GOOD_RATE);
        setFAIR_RATE(FAIR_RATE);
        setPOOR_RATE(POOR_RATE);
    }
    
    public void calculateTip(TipCalculator calc, ServiceQuality serviceQuality) {
        calc.calculateTip(serviceQuality, rate);
    }
    
    public double getGOOD_RATE() {
        return GOOD_RATE;
    }

    public void setGOOD_RATE(double GOOD_RATE) {
        this.GOOD_RATE = GOOD_RATE;
    }

    public double getFAIR_RATE() {
        return FAIR_RATE;
    }

    public void setFAIR_RATE(double FAIR_RATE) {
        this.FAIR_RATE = FAIR_RATE;
    }

    public double getPOOR_RATE() {
        return POOR_RATE;
    }

    public void setPOOR_RATE(double POOR_RATE) {
        this.POOR_RATE = POOR_RATE;
    }
    
}
