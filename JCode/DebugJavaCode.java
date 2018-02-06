/**
 * @author gaurnitai
 * @created_date Jan 26, 2018
 */

package com.javabasics.debugging;

/*Debugging allows you to run a program interactively while watching the source code and the variables during the execution.

A breakpoint in the source code specifies where the execution of the program should stop during debugging. Once the program is stopped you can investigate variables, change their content, etc.

To stop the execution, if a field is read or modified, you can specify watchpoints.*/

public class DebugJavaCode {

	private int result = 0;

	public int getResult() {
		return result;
	}

	public void count() {
		for (int i = 0; i < 5; i ++) {
			result = result + (i + 1);
			//result += i + 1;
		}
	}

	public static void main(String[] args) {
		System.out.println("Lets start Debug");
		DebugJavaCode djc = new DebugJavaCode();
		djc.count();
		System.out.println(djc.getResult());
		

	}
	
	

}
