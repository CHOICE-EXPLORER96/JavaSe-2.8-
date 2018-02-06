/**
 * @author gaurnitai
 * @created_date Jan 23, 2018
 */

package com.javabasics.debugging;

public class DebugChallengePrime {

	// Here consider any value and predict the output
	// Then run the program and compare the actual output with predicted output
	// Then debug the program to find the issue/logical error
	// Fix the issue and rerun the program

	public static void primeNumber1(int x) {

		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				break;
			}
			if (x == i) {
				System.out.println(x);
			}
		}

	}

	public static void primeNumber2(int x) {

		for (int i = 2; i <= x; i++) {

			if (x == i) {
				System.out.println(x);
			}
			if (x % i == 0) {
				break;
			}

		}

	}

	public static void primeNumber3(int x) {

		for (int i = 2; i <= x; i++) {

			if (x % i == 0) {
				break;
			}
			if (x == i + 1) {
				System.out.println(x);
			}

		}

	}

	public static void primeNumber4(int x) {

		for (int i = 2; i <= x; i++) {
			if (x % i == 0) {
				break;
			}
			if (x == i) {
				System.out.println(x);
			}
		}

	}

	public static void main(String[] args) {
		System.out.println("=====");
		primeNumber1(13);
		System.out.println("=====");
		primeNumber2(13);
		System.out.println("=====");
		primeNumber3(13);
		System.out.println("=====");
		primeNumber4(13);

	}

}
