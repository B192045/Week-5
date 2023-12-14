/*5. Implement the following case study. 
 RBI governs and formulates rules and regulations for SBI, HDFC and DCB 
Banks.
Rules framed by RBI:
i. All banks should facilitate credit(), debit(), displayBalance(), 
PersonalLoanEligibility(), homeLoanEligibility(), vehicleLoanEligibilty() to 
customers ii. credit(),debit() and displayBalance() are common for all Banks where as rest of 
functionalities changes with respect to Banks.
iii. Make necessary assumptions on Loan eligibilities like Loan eligibility changes 
as per his/her annual income, type of job(gvt/private), it depends on his property 
and medical fitness etc.*/

import java.util.*;

interface RBI{
 double Credit(int amount);
 double Debit(int amount);
 void displaybalance();
 String personalloaneligibility();
 String homeloaneligibility();
 String vehicleloaneligibility();}

class Common implements RBI{
 int amount;
 int balance;
 Common(int balance){
 this.balance=balance;}

 public double Credit(int amount){
 balance=balance+amount;
 return balance;}
 
 public double Debit(int amount){
 balance=balance-amount;
 return balance;}

 public void displaybalance(){
 System.out.println("Balance is: "+balance);}

 public String personalloaneligibility() {
        return "Not applicable";
    }

 public String homeloaneligibility() {
        return "Not applicable";
    }

 public String vehicleloaneligibility() {
        return "Not applicable";
    }
}

class SBI extends Common{
 String jobtype;
 int annualincome;
 boolean medicalfitness;
 SBI(int balance,String jobtype,int annualincome,boolean medicalfitness){
 super(balance);
 this.jobtype=jobtype;
 this.annualincome=annualincome;
 this.medicalfitness=medicalfitness;}

 public String personalloaneligibility(){
 if(this.jobtype.equalsIgnoreCase("govt"))
 return "eligible";
 return "not eligible";}
 
 public String homeloaneligibility(){
 if(this.annualincome>50000)
 return "eligible";
 return "not eligible";}

 public String vehicleloaneligibility(){
 if(this.medicalfitness)
 return "eligible";
 return "not eligible";}}

 class HDFC extends Common{
 String jobtype;
 int annualincome;
 boolean medicalfitness;
 HDFC(int balance,String jobtype,int annualincome,boolean medicalfitness){
 super(balance);
 this.jobtype=jobtype;
 this.annualincome=annualincome;
 this.medicalfitness=medicalfitness;}

 public String personalloaneligibility(){
 if(this.jobtype.equalsIgnoreCase("private"))
 return "eligible";
 return "not eligible";}
 
 public String homeloaneligibility(){
 if(this.annualincome>30000)
 return "eligible";
 return "not eligible";}

 public String vehicleloaneligibility(){
 if(this.medicalfitness)
 return "eligible";
 return "not eligible";}}

class Week5_5{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 //System.out.println("Enter initial balance: ");
 //int balance=sc.nextInt();
 System.out.println("Enter job type: ");
 String types=sc.next();
 System.out.println("Enter annual income: ");
 int annual=sc.nextInt();
 Common c=new Common(10000);
 System.out.println("Enter true if u have medical fitness: ");
 boolean medical=sc.nextBoolean();
 SBI r=new SBI(1000,types,annual,medical);
 HDFC h=new HDFC(1000,types,annual,medical);
 System.out.println(c.Credit(100));
System.out.println(c.Debit(100));
 c.displaybalance();
 System.out.println("Select bank 1.rbi  2.hdfc");
 int n=sc.nextInt();
 if(n==1){
 System.out.println("Personal loan eligibility(rbi): "+r.personalloaneligibility());
 System.out.println("Home loan eligibility(rbi): "+r.homeloaneligibility());
 System.out.println("Vehicle loan eligibility(rbi): "+r.vehicleloaneligibility());}
 else if(n==2){
 System.out.println("Personal loan eligibility(hdfc): "+h.personalloaneligibility());
 System.out.println("Home loan eligibility(hdfc): "+h.homeloaneligibility());
 System.out.println("Vehicle loan eligibility(hdfc): "+h.vehicleloaneligibility());}}}
 
 
 
 
 