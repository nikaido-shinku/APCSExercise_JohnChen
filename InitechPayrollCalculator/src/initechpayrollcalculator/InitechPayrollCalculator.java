
package initechpayrollcalculator;


public class InitechPayrollCalculator {

    /**
     *
     */

    public static void main(String[] args) {
        Initech init = new Initech();
        try{
            init.timesheetEntry("john", "20955 west tejas trail", "Texas",7.509,50);
            init.timesheetEntry("chen;19 Wenyi Road;Massachussetts;8.1102;50");
        }
        catch(IniException e){
            e.printStackTrace();
            
       
        }
        init.printSalaries();
        try{init.printCheckMailer("john");
        }
        catch (IniException e){
        e.printStackTrace();
        }
        init.printPersonnelDate("name");
        init.search("address", "20955 west tejas trail");
        init.accounting();
    
}
}