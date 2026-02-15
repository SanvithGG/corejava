package com.javabasics;

public class BasicLoops {

	public static void main(String[] args) {
	
	int a =1;               //start
	while(a<4)             //condition
	{                      
		System.out.println(a);
		a++;               //update
	}
      int b = 4;
      do 
      {
    	  System.out.println("b :"+b);
    	  b++;
      }while(b<4);
      System.out.println("---------------------------");
      
      for(int i=1; i<4; i++)
      {
    	  System.out.println("i:"+i);
      }
      
      
      for(int i=1; i<4; i++)
      {
    	  System.out.println("*"); 
      }
      
      for(int i=1; i<4; i++)
      {
    	  System.out.print("*"); 
      }
      
    
	}
  
}
