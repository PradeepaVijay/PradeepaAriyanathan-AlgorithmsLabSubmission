package com.greatlearning.driver;

import java.util.Scanner;

public class PayMoney {
Scanner sc = new Scanner(System.in);
	int target_value = 0;
	//method gets each value of target and compare with the minimum number of transactions 
	public void payMoneyTransaction(int num_of_target, int[] array, int size) {
		for (int i = 0; i < num_of_target; num_of_target--) {
			System.out.println("Enter the value of target");
			target_value = sc.nextInt();
			int sum = 0;
			boolean flag = false;
			for (int j = 0; j < size; j++) {
				sum += array[j];
				if (sum >= target_value) {
					System.out.println("Target Achieved after " + (j + 1) + " Transactions");
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println("Target not achieved");
			}

		}
	}
}