/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancedprogramming_project;
import java.util.Scanner;
import java.io.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 *
 * @author bashayermajhoud
 */
public class AdvancedProgramming_Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        // create and write in file stream
        
//passengersInfo passenger1=new passengersInfo();
//passengersInfo passenger2=new passengersInfo();
//passengersInfo passenger3=new passengersInfo();
//passengersInfo passenger4=new passengersInfo();
//passengersInfo passenger5=new passengersInfo();
//passengersInfo passenger6=new passengersInfo();
//passenger1.setName("Abduallah");
//passenger1.setPhoneNum("0554567283");
//passenger1.setDestination("jeddah");
//passenger1.setFlightNum("1234");
//passenger1.setPrice("200$");
//////////////////////
//passenger2.setName("Rahaf");
//passenger2.setPhoneNum("0556372193");
//passenger2.setDestination("jeddah");
//passenger2.setFlightNum("1234");
//passenger2.setPrice("200$");
//////////////////
//passenger3.setName("Sara");
//passenger3.setPhoneNum("0546573211");
//passenger3.setDestination("jeddah");
//passenger3.setFlightNum("1234");
//passenger3.setPrice("200$");
///////////////////
//passenger4.setName("Bashayer");
//passenger4.setPhoneNum("0564543524");
//passenger4.setDestination("jeddah");
//passenger4.setFlightNum("1234");
//passenger4.setPrice("200$");
//////////////
//passenger5.setName("Mohammed");
//passenger5.setPhoneNum("0545436271");
//passenger5.setDestination("jeddah");
//passenger5.setFlightNum("1234");
//passenger5.setPrice("200$");
////////////////
//passenger6.setName("Ali");
//passenger6.setPhoneNum("0545467890");
//passenger6.setDestination("jeddah");
//passenger6.setFlightNum("1234");
//passenger6.setPrice("200$");
//
//try (final FileOutputStream fout = new FileOutputStream("passengers.txt");
//				final ObjectOutputStream out = new ObjectOutputStream(fout)) {
//			out.writeObject(passenger1);
//                        out.writeObject(passenger2);
//                        out.writeObject(passenger3);
//                        out.writeObject(passenger4);
//                        out.writeObject(passenger5);
//                        out.writeObject(passenger6);
//			//out.writeInt(12345);
//			//out.writeObject("Today");
//			//out.writeObject(new Date());
//		      
//			out.flush();
//			System.out.println("success");
//		} catch (IOException e) {
//			e.printStackTrace();
//
//		}
         
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("");
            System.out.println(" Welcome to Airline Reservation Management System ");
            System.out.println("");
            System.out.println("+--------------------------------------+\n"
                    + "|              Main Menu               |\n"
                    + "+--------------------------------------+\n"
                    + "| 1. Reservations Informations.        |\n"
                    + "| 2. Book flight.                      |\n"
                    + "| 3. Exit.                             |\n"
                    + "+--------------------------------------+");

            System.out.print(" > Please enter your choice... : ");
            int choiceFromMainMenue = input.nextInt();
            if (choiceFromMainMenue == 1) {
                try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("passengers.txt"))) {
                    System.out.println("");
                    final passengersInfo passenger = (passengersInfo) in.readObject();
                    final passengersInfo passenger1 = (passengersInfo) in.readObject();
                    final passengersInfo passenger2 = (passengersInfo) in.readObject();
                    final passengersInfo passenger3 = (passengersInfo) in.readObject();
                    final passengersInfo passenger4 = (passengersInfo) in.readObject();
                    final passengersInfo passenger5 = (passengersInfo) in.readObject();
                    System.out.println();
                    System.out.println("| Reservations Informations:");
                    System.out.println("+----------------------+--------------+-----------+--------------+-----------+");
                    System.out.println("|    Passenger Name    | Phone Number | Flight No |     City     |   Price   |");
                    System.out.println("+----------------------+--------------+-----------+--------------+-----------+");
                    System.out.printf("| %-20s | %12s | %9s | %-12s | %9.8s |\n",passenger.getName(), passenger.getPhoneNum(), passenger.getFlightNum() , passenger.getDestination(), passenger.getPrice());
                    System.out.printf("| %-20s | %12s | %9s | %-12s | %9.8s |\n",passenger1.getName(), passenger1.getPhoneNum(), passenger1.getFlightNum() , passenger1.getDestination(), passenger1.getPrice());
                    System.out.printf("| %-20s | %12s | %9s | %-12s | %9.8s |\n",passenger2.getName(), passenger2.getPhoneNum(), passenger2.getFlightNum() , passenger2.getDestination(), passenger2.getPrice());
                    System.out.printf("| %-20s | %12s | %9s | %-12s | %9.8s |\n",passenger3.getName(), passenger3.getPhoneNum(), passenger3.getFlightNum() , passenger3.getDestination(), passenger3.getPrice());
                    System.out.printf("| %-20s | %12s | %9s | %-12s | %9.8s |\n",passenger4.getName(), passenger4.getPhoneNum(), passenger4.getFlightNum() , passenger4.getDestination(), passenger4.getPrice());
                    System.out.printf("| %-20s | %12s | %9s | %-12s | %9.8s |\n",passenger5.getName(), passenger5.getPhoneNum(), passenger5.getFlightNum() , passenger5.getDestination(), passenger5.getPrice());


                } catch (IOException | ClassNotFoundException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                    // TODO code application logic here
                }
            }
            System.out.println("  ");

            if (choiceFromMainMenue == 2) {
System.out.println("| Booking Flight.\n" +
                           "+--------------------+");
                System.out.println("The available seats [5]");
                System.out.println("+--------------------+\n");
                
                TicketCounter ticketCounter = new TicketCounter();
                TicktsBookingThread t1 = new TicktsBookingThread(ticketCounter, "Rahaf", 4);
                TicktsBookingThread t2 = new TicktsBookingThread(ticketCounter, "Bashayer", 1);
                TicktsBookingThread t3 = new TicktsBookingThread(ticketCounter, "Sara", 2);
                TicktsBookingThread t4 = new TicktsBookingThread(ticketCounter, "Ali", 1);
                TicktsBookingThread t5 = new TicktsBookingThread(ticketCounter, "Abduallah", 3);
                t1.start();
                t2.start();
                t3.start();
                t4.start();
                t5.start();
                t1.join();
                t2.join();
                t3.join();
                t4.join();
                t5.join();

            } else if (choiceFromMainMenue == 3) {
                System.out.println("<<Thank you, Bye>>");
                System.exit(0);

            }
            /*
            else { // if the user input other number the prgram print a message wrong choice and the main menue display.
                
                System.out.println("            Invalid Choice!! Please Try again");
                System.out.println("");

            }
*/
        }/////while loop end
    }
    
}
