package com.techelevator.dice_rollers;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class MainApp {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Integer sides = -1;
		while(sides!=0) {
			try {
				System.out.println("How many sides to your dice? Enter 0 to escape");
				sides = Integer.parseInt(input.nextLine());
				if (sides==0) {
					break;
				}
				else if(sides < 0) {
					System.out.println("Please enter a positive integer");
				} else {
					BigDecimal j = new BigDecimal((Math.random()*sides)+1).setScale(0, RoundingMode.FLOOR);
					System.out.println(j);
				}
			} catch(NumberFormatException e) {
				System.out.println("Please enter a valid number");
			}
		}
		System.out.println("Thank you");
	}
}
