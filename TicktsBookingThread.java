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
public class TicktsBookingThread extends Thread {

    private TicketCounter ticketCounter;
    private String passengerName;
    private int noOfSeatsToBook;

    public TicktsBookingThread(TicketCounter ticketCounter, String passengerName, int noOfSeatsToBook) {
        this.noOfSeatsToBook = noOfSeatsToBook;
        this.passengerName = passengerName;
        this.ticketCounter = ticketCounter;
    }

    public void run() {
        try {
            // Displaying the thread that is running 

            ticketCounter.bookTickets(passengerName, noOfSeatsToBook);

        } catch (Exception e) {
            // Throwing an exception 
            System.out.println("Exception is caught");
        }
    }
}
