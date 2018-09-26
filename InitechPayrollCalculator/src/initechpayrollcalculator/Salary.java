/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initechpayrollcalculator;

/**
 *
 * @author 1
 */
public class Salary {
    private double weksal = 0;
    private double bssal = 0;
    private double ovsal = 0;
    private double remain = 0;
    
    public Salary(double bssal){
        
        this.bssal = bssal;
        this.ovsal = bssal * 1.5;
        
        
    }
  
    public void changeSal(double newsal){
        this.bssal = newsal;
        this.ovsal = this.bssal * 1.5;
    }
    
    public double fetchBsSal(){
        return bssal;
    }
    
    public double fetchOvsal(){
        return ovsal;
    }
    
    public double fetchWeksal(){
        return weksal;
    }
    
    public double fetchRemain(){
        return remain;
    }
    
    public void calcWeekSal(double wkhour){
        if (wkhour < 40) {
            this.weksal = this.bssal * wkhour;
            
        }
        else{
            this.weksal = 40 * this.bssal + (wkhour-40)* this.ovsal;
        }
    }
    public double calcTotalOvSal(){
        double ttovsal = weksal - bssal*40;
        return ttovsal;
    }
    
    public boolean checkBsSal(double min){
        if (this.bssal < min) {
            return false;
        }
        else return true;
    }
    public boolean checkWekSal(){
        if (this.weksal < 180) {
            return false;
        }
        else return true;
    }
    public void rounding(){
        double bssalr =  this.bssal%0.01;
        double weksalr = this.weksal%0.01;
        double ovsalr = this.ovsal%0.01;
        this.remain = weksalr;
        this.bssal = bssal - bssalr;
        this.weksal = weksal - weksalr;
        this.ovsal = ovsal - ovsalr;
    }
    

    }
