/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancedprogramming_project;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author bashayermajhoud
 */
public class passengersInfo implements Serializable{
    private String name;
private String price;
private String phoneNum;
private String flightNum;
private String destination;

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getFlightNum() {
        return flightNum;
    }

    public String getDestination() {
        return destination;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
    
}
