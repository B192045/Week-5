/* 4. Create an Interface Fare with methods getFare(), getAmenities() to get the
amount paid for Travelling and Amenities provided in journey. Calculate the fare
paid and Amenities provided in Bus, Train and Flight implementing interface Fare.
Note :The Fare per Kilometer is different for Road and Rail and airways and even
the fare changes as per type of Bus (A/c, Non A/c, sleeper, semi sleeper etc.,)
Train( General, Sleeper, A/c), Flight (Economy/Business class) . Make necessary
assumptions on distance travelled etc.,.*/


//if it cant be implemented make method as public 

import java.util.*;

interface Fare{
  int getfare();
  String getamenities();}
 
 class Bus implements Fare{
   String type;
   int distance;
   int fareperkm=2;
   int rate;
   Bus(String type,int distance){
   this.type=type;
   this.distance=distance;}
   
   public int getfare(){
   if(type.equalsIgnoreCase("AC")){
   rate=2000;
   }
   if(type.equalsIgnoreCase("Non AC")){
   rate=1000;
   }
   if(type.equalsIgnoreCase("sleeper")){
   rate=500;
   }
   if(type.equalsIgnoreCase("semisleeper")){
   rate=300;
   }return rate*fareperkm*distance;}

 public String getamenities(){
 return "WIFI,FOOD,BOOKS";}}



class Week5_4{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter distance: ");
 int n=sc.nextInt();
 System.out.println("Enter vehicle: ");
 String vehicle=sc.next();
 if(vehicle.equalsIgnoreCase("BUS")){
 System.out.println("Enter type: ");
 String s=sc.next();
 Bus b=new Bus(s,n);
 System.out.println("Fare is: "+b.getfare());
 System.out.println("Amenities are: "+b.getamenities());}

}}


