/** 
Author: George Samu
Purpose: The purpose of this program is to understand how to
use parseInt or parseDouble and parseFloat.
Date: 6/14/2020
*/

import java.util.Scanner;

public class UnderstandingParseMethod
{
		public static void main(String[]args)
		{
		
		String priceOfBook1="46.32";
		String priceOfBook2="12.99";
		
		Scanner keyboard= new Scanner(System.in);
		System.out.println("What is the input: ");
		String input =keyboard.next();
		
		float price1=Float.parseFloat(priceOfBook1);
		
		float price2=Float.parseFloat(priceOfBook2);
		
		float total=price1+price2;
		

		int inputOne=Integer.parseInt(input);
		
		System.out.println("The total is"+String.format("$%.2f", total));
		
		System.out.println("The paseInt of input is: "+inputOne);
		
		
	
		
		}//end main
}// end UnderstandingParseMethod