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
public class Employee {
    private String name = "";
    private Salary salary;
    private String streetaddress = "";
    private double wkhour = 0.00;
    private String state = "";
    
    public void changeName(String newName){
        this.name = newName;
    }
    
    public void changeSalary(Salary newSalary){
        this.salary = newSalary;
    }
    
    public void changeStreetAddress(String newAddress){
        this.streetaddress = newAddress;
    }
    
    public void changeWorkHour(double newWkhour){
        this.wkhour = newWkhour;
    }
    
    public void changeState(String newState){
        this.state = newState;
    }
    
    public String fetchName(){
        return name;
    }
    
    public Salary fetchSalary(){
        return salary;
    }
    
    public String fetchStreetAddress(){
        return streetaddress;
    }
    
    public double fetchWkHour(){
        return wkhour;
    }
    
    public String fetchState(){
        return state;
    }
    public boolean checkByState(){
        if (this.state == "Massachussetts") {
            return this.salary.checkBsSal(8.0);
        }
        else return this.salary.checkBsSal(7.0);
    }

    public boolean checkWkHour(){
        if (wkhour < 20) {
            return false;
        }
        else if(wkhour > 75){
            return false;
        }
        else return true;
    }
    
    public boolean checkOvSal(){
        if (salary.calcTotalOvSal() > 400){
            return false;
        }
        else return true;
    }


    public Employee (String name, String streetaddress, String state, Salary salary, double  wkhour){
        this.name = name;
        this.streetaddress = streetaddress;
        this.state = state;
        this.salary = salary;
        this.wkhour = wkhour;
        this.salary.calcWeekSal(wkhour);
        this.salary.rounding();
    }
    
    
}
