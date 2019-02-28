package Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercise2 {


	public static void main(String[] args) {
		//Constructor that will initialize a class variable
		Materia obj1 = new Materia(7.8);
		//Apply constructor overloading.
		Materia obj2 = new Materia(7.8, 50);	
				
		//Apply method overloading.		
		Methods obj3 = new Methods();
		obj3.add("Matematicas");	
		obj3.add("Matematicas",10);
		
		//Create a property that returns a string
		Methods Biologia = new Methods();
		Biologia.setName("Biologia");
		System.out.println("Nombre de la materia: "+ Biologia.getName() );
		
		//Create a method to separate a list of 20 numbers between odds and even
		Lista();
		//Create a method to print numbers in the following pattern - from 0 to 20
	    Pattern();
		

	}
	public static void Lista() {
		ArrayList<Integer> list= new ArrayList<Integer>(20);
		ArrayList<Integer> even= new ArrayList<Integer>(20);
		ArrayList<Integer> odd= new ArrayList<Integer>(20);	
		Scanner sc3 = new Scanner(System.in);
		for(int i=0; i<20; i++) {

        	System.out.println('\n'+"Enter the "+ i + " Number");	        
	        list.add(sc3.nextInt());
 }

		int len1=list.size();
		for(int i=0; i<len1; i++) {
				if(list.get(i)%2==0) {
				System.out.println("Even number: "+ list.get(i));
				even.add(list.get(i));
				}
				else if(list.get(i)%2!=0) {
					System.out.println("Odd Number: "+ list.get(i));
			        odd.add(list.get(i));
				}
		 }
		System.out.println('\n'+"List of Even and Odd Numbers: ");
		for(Integer x:even) 			
			System.out.println("Even number: "+ x);
		for(Integer x:odd) 			
			System.out.println("Odd number: "+ x);
			
	}
	
	public static void Pattern() {
		
		int[] numbers;
		 numbers=new int[20];
		 int len1=numbers.length;
		 StringBuilder builder=new StringBuilder();
		 Scanner sc3 = new Scanner(System.in);
		 for(int i=0; i<len1; i++) {

		        	System.out.println('\n'+"Enter the "+ i + " Number");
			        numbers[i] = sc3.nextInt();
		 }
		
		   Arrays.sort(numbers); 
		   int x=0;
		   for(int i=1;i<=10;i++)
		   {
		    for(int j=1;j<=i;j++)
		    {
		     if(i>=2 && j<=i-1)
		     {
		      System.out.print(" ");
		     }
		     else
		     {
		    
		      System.out.print(numbers[x]);
		      builder.append(numbers[x]+"  ");
		      x++;
		     
		     }
		    }
		    System.out.println();
		   }
		   
		  
		   for(int i=1;i<=10;i++)
		   {
		    for(int j=10;j>i;j--)
		    {
		     System.out.print(" ");
		    }
		    for(int k=1;k<=i;k++)
		    {
		     if(i>=2 && k>1)
		     {
		      System.out.print(" ");
		     }
		     else
		     {
		    	 System.out.print(numbers[x]);
		    	 builder.append(numbers[x]+"  ");
			      x++;
		     }
		    }
		    System.out.println();
		   }
		   
		   System.out.println('\n'+"Builder: "+ builder);
	}
	
}
