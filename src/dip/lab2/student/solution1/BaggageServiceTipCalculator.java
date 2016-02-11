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
public class BaggageServiceTipCalculator implements TipCalculator{
    private double tip;
    private double baseTipPerBag;
    private int bagCount;
    private double GOOD_RATE;
    private double FAIR_RATE;
    private double POOR_RATE;
    
    
    public BaggageServiceTipCalculator(double baseTipPerBag,int bagCount){
        setBaseTipPerBag(baseTipPerBag);
        setBagCount(bagCount);
    }
    
    @Override
    public double calculateTip(ServiceQuality serviceQuality){
            switch(serviceQuality) { 
            case GOOD: tip = baseTipPerBag * bagCount * (1 + getGOOD_RATE());
                break;
            case FAIR: tip = baseTipPerBag * bagCount * (1 + getFAIR_RATE());
                break;
            case POOR: tip = baseTipPerBag * bagCount * (1 + getPOOR_RATE());
                break;
        }

        return tip;
    }

    public double getTip() {
        return tip;
    }


    public double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public void setBaseTipPerBag(double baseTipPerBag) {
        this.baseTipPerBag = baseTipPerBag;
    }

    public int getBagCount() {
        return bagCount;
    }

    public void setBagCount(int bagCount) {
        this.bagCount = bagCount;
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
