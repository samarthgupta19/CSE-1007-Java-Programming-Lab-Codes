/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Samarth Gupta
 */
public class Q3 {
public static void main(String[] args) {
vehicle[] myobj=new vehicle[10];
myobj[0] = new vehicle("John",40,"LMV");
myobj[1] = new vehicle("Mike",50, "HGMV");
myobj[2] = new vehicle("Bob", 20, "MGV");
myobj[3] = new vehicle("Ryan",30, "HMV");
myobj[4] = new vehicle("Tim", 40, "LMV");
myobj[5] = new vehicle("Joey",60, "HMV");
myobj[0].display();
myobj[1].display();
myobj[2].display();
myobj[3].display();
myobj[4].display();
myobj[5].display();
}
}
class vehicle{
String dname;
int age;
String ltype;
vehicle(String name,int a,String type)
{
dname=name;
age=a;
ltype=type;
}
public void display()
{
if(ltype=="HMV") // To Display Only HMV
{
System.out.println("Driver Name - "+dname+"\n"+"Age - "+age+"\n"+"Licence Type - "+ltype);
}
}
}