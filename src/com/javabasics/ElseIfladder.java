package com.javabasics;

public class ElseIfladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int age =1;
           if(age >= 22 && age <= 32) 
           {
        	   System.out.println("Eligible for Marrage");
           }
           else if(age<22)
           {
        	   System.out.println("Have patience and come back when u reach 22");
           }
           else
           {
        	   System.out.println("U have lot of patience try ur Best");
           }
           
           int range =10;
           if(range >= 22 && range <= 32) 
           {
        	   System.out.println("It's in the Range");
           }
           else if(range<22)
           {
        	   System.out.println("Below the Range");
           }
           else 
           {
        	   System.out.println("Out of Range");
           }
           
	}

}
