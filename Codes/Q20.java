// Rename the filename.java to be same as public class name.

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Samarth Gupta
 */

import java.util.*;
import java.io.*;
class SpeedException extends Exception{
SpeedException(String s){
super(s);
}
}
class Vehicle
{
protected String owner;
protected String make;
protected double speed;
protected int year;
public Vehicle(String owner, String make, double speed, int year)
{
super();
this.owner=owner;
this.make=make;
this.speed=speed;
this.year=year;
}
public String getOwner(){
return owner;
}
public void setOwner(String owner){
this.owner=owner;
}
public String getMake(){
return make;
}
public void setMake(String make){
this.make=make;
}
public double getSpeed() throws SpeedException {
return speed;
}
public void setSpeed(double speed) {
this.speed=speed;
}
public int getYear(){
return year;
}
public void setYear(int year){
this.year=year;
}
}
class Bus extends Vehicle{
private int maxPassengers;
private double maxCapacity;
public Bus(String owner, String make, double speed, int year, int maxPassengers, double maxCapacity)
{
super(owner,make,speed,year);
this.maxPassengers=maxPassengers;
this.maxCapacity=maxCapacity;
}
public int getPassengers(){
return maxPassengers;
}
public void setPassengers(int maxPassengers){
this.maxPassengers=maxPassengers;
}
public double getCapacity(){
return maxCapacity;
}
public void setCapacity(double maxCapacity){
this.maxCapacity=maxCapacity;
}
@Override
public double getSpeed() throws SpeedException{
if(speed<100)
return speed;
else
throw new SpeedException("Speed to be under 100 km/hr");
}
}
class Truck extends Vehicle{
private int maxPassengers;
private double maxCapacity;
public Truck(String owner, String make, double speed, int year, int maxPassengers, double maxCapacity)
{
super(owner,make,speed,year);
this.maxPassengers=maxPassengers;
this.maxCapacity=maxCapacity;
}
public int getPassengers(){
return maxPassengers;
}
public void setPassengers(int maxPassengers){
this.maxPassengers=maxPassengers;
}
public double getCapacity(){
return maxCapacity;
}
public void setCapacity(double maxCapacity){
this.maxCapacity=maxCapacity;
}
}
public class vehicleDet
{
public static void main(String[] args)
{
Bus b = new Bus("Samarth Gupta","Honda",110,2020,50,50.5);
Truck t = new Truck("George","Maruti",190,2019,50,50.5);
try{
System.out.println("Owner: "+b.getOwner());
System.out.println("Make: "+b.getMake());
System.out.println("Speed: "+b.getSpeed());
System.out.println("Year: "+b.getYear());
System.out.println("Max Passengers: "+b.getPassengers());
System.out.println("Engine capacity: "+b.getCapacity());
System.out.println("\n----------------------------\n");
System.out.println("Owner: "+t.getOwner());
System.out.println("Make: "+t.getMake());
System.out.println("Speed: "+t.getSpeed());
System.out.println("Year: "+t.getYear());
System.out.println("Max Passengers: "+t.getPassengers());
System.out.println("Engine capacity: "+t.getCapacity());
}
catch(Exception e)
{e.printStackTrace();}
}
}