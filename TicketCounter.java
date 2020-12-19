/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancedprogramming_project;

/**
 *
 * @author bashayermajhoud
 */
public class TicketCounter {
     private int availableSeats= 5;
   
    public synchronized void bookTickets(String pName,int NumOfSeats){
        if((availableSeats>=NumOfSeats)&&(NumOfSeats>0)){
            
            System.out.println(pName+" has reserved ["+NumOfSeats+"] seat(s) successfully");
//            System.out.println("Sates Booked Successfully...");
            System.out.println("");
            availableSeats=availableSeats-NumOfSeats;
        }
        else{
            System.out.println(pName+" can not reserve a seat [Seats Not Available].");
//            System.out.println("Sates Not Available..");
            System.out.println("");
        }
    
    }
    
}
