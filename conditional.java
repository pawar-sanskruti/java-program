package sample;

import java.util.Scanner;

public class conditional {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a age:");
		int age=sc.nextInt();
		
		if(age>5 && age <=18) {
			
			System.out.println("child");
		}
		else if(age>=18 && age <=30) {
			System.out.println("young");
		}
		else if(age>=30 && age<=90) {
			System.out.println("adult");
			
		}
		else {
			System.out.println("age is less than 5" );
		}
	}
	
}
