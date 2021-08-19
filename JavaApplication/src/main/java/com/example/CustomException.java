package com.example;
import java.util.*;
public class CustomException extends Exception{
	public CustomException(String st) {
		super(st);
		int amount = 10000;
		Scanner scan = new Scanner(System.in);
		System.out.println("how much to withdraw");
		int withdraw = scan.nextInt();
		try {
			if(withdraw > amount) {
				CustomException b= new CustomException("Insuffient Balance");
				throw b;
				
			}else {
				amount= amount - withdraw;
				System.out.println("Balance Amount = " + amount);
			}
		}catch(CustomException b) {
			System.out.println(b.getMessage());
		}
	}

}
