/*2. Create an abstract class Employee with abstract method getAmount() which displays the amount paid to employee. Reuse this class to calculate the amount to be paid to WeeklyEmployees and
HourlyEmployees according to no. of hours and total hours for HourlyEmployee and no. of weeks and total weeks for WeeklyEmployee.*/

import java .util.*;

abstract class Employee{
 abstract double getAmount();}
 
 class WeeklyEmployee extends Employee{
  double total;
  double numofweeks;
  
  WeeklyEmployee( double total,double numofweeks){
  this.numofweeks=numofweeks;
  this.total=total;}
  
  double getAmount(){
   return 500*numofweeks;}}
   
   class HourlyEmployee extends Employee{
  double total;
  double numofhrs;
  
  HourlyEmployee( double total,double numofhrs){
  this.numofhrs=numofhrs;
  this.total=total;}
  
  double getAmount(){
   return 500*numofhrs;}}
   
   class Week5_2{
   public static void main(String args[]){
   WeeklyEmployee w1=new WeeklyEmployee(168,6);
   System.out.println(w1.getAmount());
   HourlyEmployee h1=new HourlyEmployee(168,6);
    System.out.println(h1.getAmount());}}
   
