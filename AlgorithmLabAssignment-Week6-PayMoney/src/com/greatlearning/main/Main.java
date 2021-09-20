package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.driver.PayMoney;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// Get the user input size of transaction array
		System.out.println("Enter the size of transaction array");
		int size = sc.nextInt();
		int[] array = new int[size];
		// Get the money transaction values
		System.out.println("Enter the values of array");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		// Get the number of target transactions to be verfied
		System.out.println("Enter the total number of targets that needs to be achieved");
		int num_of_target = sc.nextInt();
		PayMoney pm = new PayMoney();
		pm.payMoneyTransaction(num_of_target, array, size);
	}
}
