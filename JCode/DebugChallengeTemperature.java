/**
 * @author gaurnitai
 * @created_date Jan 23, 2018
 */

package com.javabasics.debugging;

public class DebugChallengeTemperature {
	// Here consider any value and predict the output
	// Then run the program and compare the actual output with predicted output
	// Then debug the program to find the issue/logical error
	// Fix the issue and rerun the program
	public void celciusToFareinheit(double celcius) {
		double farenheit = (celcius * 9 / 5) + 32; // 35 -- 95
		System.out.println(farenheit);

	}

	public void fareinheitToCelcius(double farenheit) {
		double celcius = (farenheit - 32) * (5 / 9); // 
		System.out.println(celcius); // 18.33

	}

	public static void main(String[] args) {
		DebugChallengeTemperature obj = new DebugChallengeTemperature();
		obj.celciusToFareinheit(35); // 95
		System.out.println("Lets debug now");
		obj.fareinheitToCelcius(102); // 18.33
		//System.out.println(5 / 9); // this is getting zero and hence the output is zero
	}

}
