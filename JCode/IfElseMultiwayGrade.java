/**
 * @author gaurnitai
 * @created_date Dec 8, 2018
 */

package com.javabasics.decisonmakingstatements;

import java.util.Scanner;

public class IfElseMultiwayGrade {

	char grade;

	void multiwayIfElse() {
		Scanner sc = new Scanner(System.in);
		grade = sc.next().charAt(0);

		if (grade == 'A') {
			System.out.println("Take addmision in CS");
		} else {
			if (grade == 'B') {
				System.out.println("Take addmision in Electronics");
			} else {
				if (grade == 'C') {
					System.out.println("Take addmision in Mechanical");
				} else {
					if (grade == 'D') {
						System.out.println("Not eligible for admission");
					} else {
						System.out.println("Please enter valid input A,B,C or D");
					}
				}
			}
		}
		sc.close();

	}

}
