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
public class FoodServiceTipCalculator implements TipCalculator{
    private double tip;
    private double billAmt;
    private double GOOD_RATE;
    private double FAIR_RATE;
    private double POOR_RATE;
    
    public FoodServiceTipCalculator(double billAmt){
        setBillAmt(billAmt);
    }

    @Override
    public double calculateTip(ServiceQuality serviceQuality){
            switch(serviceQuality) { 
            case GOOD: tip = billAmt * (1 + getGOOD_RATE());
                break;
            case FAIR: tip = billAmt * (1 + getFAIR_RATE());
                break;
            case POOR: tip = billAmt * (1 + getPOOR_RATE());
                break;
        }

        return tip;
    }


    public double getBillAmt() {
        return billAmt;
    }

    public void setBillAmt(double billAmt) {
        this.billAmt = billAmt;
    }
    
    public double getTip() {
        return tip;
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
    
    @Override
    public void setRates(double GOOD_RATE, double FAIR_RATE, double POOR_RATE) {
        this.GOOD_RATE = GOOD_RATE;
        this.FAIR_RATE = FAIR_RATE;
        this.POOR_RATE = POOR_RATE;
    }
    
}
