/**
 * @author gaurnitai
 * @created_date Jan 23, 2018
 */

package com.javabasics.debugging;

import java.util.Scanner;

public class DebugChallengeAverage {
	int count = 0;
	double total = 0;

	// Here consider any value and predict the output
	// Then run the program and compare the actual output with predicted output
	// Then debug the program to find the issue/logical error
	// Fix the issue and rerun the program 
	public void calculateAverage() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		while (sc.hasNextDouble()) {
			total += sc.nextDouble();
			System.out.println("Enter another number or enter 'Q' to quit");
		}
		double average = (total/count);
		System.out.println(average);
		sc.close();
	}

	public static void main(String[] args) {
		
		DebugChallengeAverage obj = new DebugChallengeAverage();
		obj.calculateAverage();
	}

}
