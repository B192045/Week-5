/*Create an abstract class Shape which calculate the area and volume of 2-d and 3-d shapes with abstract methods getArea() and getVolume(). Reuse this class to calculate the area and volume of square, circle, cube and     sphere.*/

import java.util.*;

abstract class Shape{

   abstract double getArea();
   abstract double getVolume();}
   
   class Square extends Shape{
     double side;
     Square(double side){
     this.side=side;}
     double getArea(){
     return side*side;}
     double getVolume(){
     return 0;}}
     
     class Circle extends Shape{
     double radius;
     Circle(double radius){
     this.radius=radius;}
     double getArea(){
     return 3.14*radius*radius;}
     double getVolume(){
     return 0;}}
     
     class Cube extends Shape{
     double  side;
     Cube(double  side){
     this.side=side;}
     double getArea(){
     return 6*side*side;}
     double  getVolume(){
     return side*side*side;}}
     
    class  Sphere extends Shape{
     double  radius;
     Sphere(double radius){
     this.radius=radius;}
     double getArea(){
     return 4*3.14*radius*radius;}
     double getVolume(){
     return (4/3)*3.14*radius*radius;}} 
     
     class Week5_1{
     public static void main(String args[]){
     Square s1=new Square(4);
     System.out.println("Area of square is  "+s1.getArea());
      System.out.println("volume of square is  "+s1.getVolume());
     Circle c1=new Circle(5);
      System.out.println("Area of circle is  "+c1.getArea());
       System.out.println("volume of circle is  "+c1.getVolume());
     Cube cu1=new Cube(6);
      System.out.println("Area of  cube is  "+cu1.getArea());
       System.out.println("volume of cube is  "+cu1.getVolume());
     Sphere sp1=new Sphere(7);
      System.out.println("Area of sphre is  "+sp1.getArea());
       System.out.println("volume of sphre is  "+sp1.getVolume());
     }}
     
