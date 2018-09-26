/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initechpayrollcalculator;

import java.util.ArrayList;
import javafx.scene.chart.Chart;
import jdk.nashorn.internal.codegen.CompilerConstants;

/**
 *
 * @author 1
 */
public class Initech {
    private static ArrayList<Employee> employees = new ArrayList<Employee> ();
    private static double totalsal = 0;
    private static double totalremain = 0;
    
    public static void calcTotalsal(){
        totalsal = 0;
        for (int i = 0; i < 2; i++) {
            totalsal += employees.get(i).fetchSalary().fetchWeksal();
           
        }
    }
    public static void calcTotalremain(){
        totalremain = 0;
        for (int i = 0; i < employees.size(); i++) {
            totalremain += employees.get(i).fetchSalary().fetchRemain();
            
        }
    }
    
    public static boolean checkTotalSal(){
        if (totalsal > 24000.0) {
            return false;
        }
        else return true;
    }
    
    public static void timesheetEntry(String name, String street, String state, double bssalary, double wkhr) throws IniException
    {
        Salary sal = new Salary(bssalary);
        Employee thisEmployee = new Employee(name, street, state, sal, wkhr);
        if (thisEmployee.checkByState() == false) {
            throw new IniException("the base salary requirement is not met");
        }
        else if(thisEmployee.checkOvSal() == false){
            throw new IniException("the total overwork salary requirement is not met");
        }
        else if(thisEmployee.checkWkHour() == false){
            throw new IniException("the work hour requirement is not met");
        }
        else if(thisEmployee.fetchSalary().checkWekSal() == false){
            throw new IniException("the week salary requirement is not met");
        }
        else{
        employees.add(thisEmployee);
        }
                }
    public static void timesheetEntry(String input) throws IniException
    {
        String name;
        String street;
        String state;
        double bssal;
        double wkhr;
        int nameindex;
        int streetindex;
        int stateindex;
        int bssalindex;
        
        nameindex = input.indexOf(';');
        streetindex = input.indexOf(';', nameindex+1);
        stateindex = input.indexOf(';', streetindex+1);
        bssalindex = input.indexOf(';', stateindex+1);
        //System.out.println(nameindex);
        //System.out.println(streetindex);
        //System.out.println(stateindex);
        //System.out.println(bssalindex);
        
        name = input.substring(0, nameindex);
        street = input.substring(nameindex+1,streetindex);
        state = input.substring(streetindex+1, stateindex);
        //System.out.println(input.substring(stateindex+1, bssalindex));
        bssal = Double.parseDouble(input.substring(stateindex+1, bssalindex));
        wkhr = Double.parseDouble(input.substring(bssalindex+1));
        Salary sal = new Salary(bssal);
        Employee thisEmployee = new Employee(name, street, state, sal, wkhr);
        if (thisEmployee.checkByState() == false) {
            throw new IniException("the base salary requirement is not met");
        }
        else if(thisEmployee.checkOvSal() == false){
            throw new IniException("the total overwork salary requirement is not met");
        }
        else if(thisEmployee.checkWkHour() == false){
            throw new IniException("the work hour requirement is not met");
        }
        else if(thisEmployee.fetchSalary().checkWekSal() == false){
            throw new IniException("the week salary requirement is not met");
        }
        else{
        employees.add(thisEmployee);
        }
                }
        
    
    
    public static void printSalaries(){
        for (int i = 0; i < employees.size(); i++) {
            System.out.println("Employee " + employees.get(i).fetchName() + "'s week salary is " + employees.get(i).fetchSalary().fetchWeksal());
        }
    }
    
    public static void printCheckMailer(String name)throws IniException{
        
       
            for (int i = 0; i < employees.size(); i++) {
                int count = 0;
                if(employees.get(i).fetchName() == name ){
                    count += 1;
                    if (count > 1) {
                        throw new IniException("there are multiple employers with this name, you need to input the address information.");
                    }
                    else {
                        System.out.println(employees.get(i).fetchName() + "'s address is" + employees.get(i).fetchStreetAddress() + "with an week salary of" + employees.get(i).fetchSalary().fetchWeksal());
                    
                    }
                }
                
            }
        
        
    }
    public static void printCheckMailer(String name, String address)throws IniException{
        
       
            for (int i = 0; i < employees.size(); i++) {
                if(employees.get(i).fetchName() == name && employees.get(i).fetchStreetAddress() == address){
                    
                        System.out.println(employees.get(i).fetchName() + "'s address is" + employees.get(i).fetchStreetAddress() + "with an week salary of" + employees.get(i).fetchSalary().fetchWeksal());
                    
                    
                }
                
            }
        
        
    }
    public static void accounting() {
       calcTotalsal();
       calcTotalremain();
       double remain = 24000.00 - totalsal;
       double ttovsal = 0;
       for (int i = 0; i < employees.size(); i++) {
            ttovsal += employees.get(i).fetchSalary().calcTotalOvSal();
       }
        System.out.println("the total of all earnings paid out this week is: " + totalsal + ", the remaining is: " + remain + 
        ", and the amount that was paid overtime is: " + ttovsal + "the sum of the remains that are less than 1 cent is " + totalremain );
    }
    
    public static void printAddress(){
        for (int i = 0; i < employees.size(); i++) {
            System.out.println("the address of "+ employees.get(i).fetchName() +"is:" + employees.get(i).fetchStreetAddress());
        }
    }
    public static void matchAddress(String ad){
        for (int i = 0; i < employees.size(); i++) {
            if(employees.get(i).fetchStreetAddress() == ad)
            System.out.println("the address of "+ employees.get(i).fetchName() +"is:" + employees.get(i).fetchStreetAddress());
        }
    }
    public static void printWorkHour(){
        for (int i = 0; i < employees.size(); i++) {
            System.out.println("the workhour of "+ employees.get(i).fetchName() +"is:" + employees.get(i).fetchWkHour());
        }
    }
    public static void matchWorkHour(double wkh){
        for (int i = 0; i < employees.size(); i++) {
            if(employees.get(i).fetchWkHour() == wkh)
            System.out.println("the workhour of "+ employees.get(i).fetchName() +"is:" + employees.get(i).fetchWkHour());
        }
    }
    public static void printState(){
        for (int i = 0; i < employees.size(); i++) {
            System.out.println("the state of " + employees.get(i).fetchName() +"is:"+ employees.get(i).fetchState());
        }
    }
    
    public static void matchState(String st){
        for (int i = 0; i < employees.size(); i++) {
            if(employees.get(i).fetchState() == st)
            System.out.println("the state of " + employees.get(i).fetchName() +"is:"+ employees.get(i).fetchState());
        }
    }
    public static void printWeekSalary(){
        for (int i = 0; i < employees.size(); i++) {
            System.out.println("the week salary of "+ employees.get(i).fetchName() +"is:" + employees.get(i).fetchSalary().fetchWeksal());
        }
        
    }
    public static void matchWeekSalary(double wks){
        for (int i = 0; i < employees.size(); i++) {
            if(employees.get(i).fetchSalary().fetchWeksal() == wks)
            System.out.println("the week salary of "+ employees.get(i).fetchName() +"is:" + employees.get(i).fetchSalary().fetchWeksal());
        }
        
    }
    public static void printBaseSalary(){
        for (int i = 0; i < employees.size(); i++) {
            System.out.println("the base salary of "+ employees.get(i).fetchName() +"is:" + employees.get(i).fetchSalary().fetchBsSal());
        }
        
    }
    public static void matchBaseSalary(double bss){
        for (int i = 0; i < employees.size(); i++) {
            if(employees.get(i).fetchSalary().fetchBsSal() == bss)
            System.out.println("the base salary of "+ employees.get(i).fetchName() +"is:" + employees.get(i).fetchSalary().fetchBsSal());
        }
        
    }
    public static void printOverSalary(){
        for (int i = 0; i < employees.size(); i++) {
            System.out.println("the week salary of "+ employees.get(i).fetchName() +"is:" + employees.get(i).fetchSalary().fetchOvsal());
        }
    }
    public static void matchOverSalary(double ovs){
        for (int i = 0; i < employees.size(); i++) {
            if(employees.get(i).fetchSalary().fetchOvsal() == ovs)
            System.out.println("the week salary of "+ employees.get(i).fetchName() +"is:" + employees.get(i).fetchSalary().fetchOvsal());
        }
    }
    
    public static void printTotalOverSalaryPerPerson(){
        for (int i = 0; i < employees.size(); i++) {
            System.out.println("the week salary of "+ employees.get(i).fetchName() +"is:" + employees.get(i).fetchSalary().calcTotalOvSal());
        }
    }
    
    public static void matchTotalOverSalaryPerPerson(double tos){
        for (int i = 0; i < employees.size(); i++) {
            if(employees.get(i).fetchSalary().calcTotalOvSal() == tos)
            System.out.println("the week salary of "+ employees.get(i).fetchName() +"is:" + employees.get(i).fetchSalary().calcTotalOvSal());
        }
    }
    
    
    
    public static void printPersonnelDate(String dtype){
        if (dtype == "address"){
            printAddress();
        }
        else if(dtype == "work hour"){
            printWorkHour();
            
        }
        else if(dtype == "state"){
            printState();
        }
        else if(dtype == "week salary"){
            printWeekSalary();
        }
        else if(dtype == "base salary"){
            printBaseSalary();
            
        }
        else if(dtype == "over salary"){
            printOverSalary();
            
        }
        else if(dtype == "total over salary"){
            printTotalOverSalaryPerPerson();
        }
    }
    
    public static void search(String dtype, Object data){
        if (dtype == "address"){
            matchAddress(data.toString());
            
        }
        else if(dtype == "work hour"){
            matchWorkHour((double)data);
            
        }
        else if(dtype == "state"){
            matchState(data.toString());
        }
        else if(dtype == "week salary"){
            matchWeekSalary((double)data);
        }
        else if(dtype == "base salary"){
            matchBaseSalary((double)data);
            
        }
        else if(dtype == "over salary"){
            matchOverSalary((double)data);
            
        }
        else if(dtype == "total over salary"){
            matchTotalOverSalaryPerPerson((double)data);
        }
        
    }
    
    
}
