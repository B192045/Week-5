/*3. Create an interface Vehicle with methods getCompany(),getModel(),getType()( 
Petrol/Diesel/CNG) and getConsumption(), display Company and Model, type and
calculate the fuel consumed by Two wheelers and Four Wheelers by
implementing interface Vehicle.
Note : Mileage for 4-wheeler is 14km/Ltr(petrol), 22km/Ltr(Diesel), 
18km/kg(CNG). And for 2- wheeler is 62km/Ltr(petrol) 82km/ltr(Diesel),72km/ltr 
(cng).*/

import java.util.*;

interface Vehicle{
 void getCompany();
 void getModel();
 void getType();
 double getConsumption();}

class Twowheeler implements Vehicle{
 String company;
 String model;
 String type;
 double distance;
 double d;
 Twowheeler(String company,String model,String type,double distance){
 this.company=company;
 this.model=model;
 this.type=type;
 this.distance=distance;}

 public void getCompany(){
 System.out.println(company);}

 public void getModel(){
 System.out.println(model);}

 public void getType(){
 System.out.println(type);}

 public double getConsumption(){
 if(type.equalsIgnoreCase("Petrol"))
 d=distance/62;
 if(type.equalsIgnoreCase("Diesel"))
 d=distance/82;
 if(type.equalsIgnoreCase("cng"))
 d=distance/72;
 return d;}}

class Fourwheeler implements Vehicle{
 String company;
 String model;
 String type;
 double distance;
 double d;
 Fourwheeler(String company,String model,String type,double distance){
 this.company=company;
 this.model=model;
 this.type=type;
 this.distance=distance;}

 public void getCompany(){
 System.out.println(company);}

 public void getModel(){
 System.out.println(model);}

 public void getType(){
 System.out.println(type);}

 public double getConsumption(){
 if(type.equalsIgnoreCase("Petrol"))
 d=distance/14;
 if(type.equalsIgnoreCase("Diesel"))
 d=distance/22;
 if(type.equalsIgnoreCase("cng"))
 d=distance/18;
 return d;}}

class Week5_3{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter company: ");
 String company=sc.nextLine();
 System.out.println("Enter model: ");
 String model=sc.nextLine();
 System.out.println("Enter type: ");
 String type=sc.nextLine();
 System.out.println("Enter distance: ");
 double distance=sc.nextDouble();
 System.out.println("Enter 2 for twowheeler,4 for fourwheelr");
 int n=sc.nextInt();
 if(n==2){
 Twowheeler t1=new Twowheeler(company,model,type,distance);
 t1.getCompany();
 t1.getModel();
 t1.getType();
 System.out.println("Fuel consumption is "+t1.getConsumption());}
 if(n==4){
 Fourwheeler f1=new Fourwheeler(company,model,type,distance);
 f1.getCompany();
 f1.getModel();
 f1.getType();
 System.out.println("Fuel consumption is "+f1.getConsumption());}



}}
 
 

