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
    
    public BaggageServiceTipCalculator(double billAmt){
        setBaseTipPerBag(baseTipPerBag);
        setBagCount(bagCount);
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
    
}
