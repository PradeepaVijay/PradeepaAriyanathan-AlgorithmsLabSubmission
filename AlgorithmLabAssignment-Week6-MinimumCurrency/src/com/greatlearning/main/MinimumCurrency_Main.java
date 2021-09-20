package com.greatlearning.main;
import java.util.Scanner;
import com.greatlearning.driver.MinimumCurrency_Driver;

public class MinimumCurrency_Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//Get the input value for currency denomination
		System.out.println("Enter the size of currency denominations");
		int size = sc.nextInt();
		//Calling method getArray from MinimumCurrency class to get the currency values
		int a[] = MinimumCurrency_Driver.getArray(size);
		//Calling merge sort function and arrange the currency in descending order
		MinimumCurrency_Driver.sort();
		//Get the currency value from the user
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		//Calling method to calculate minimum number of currency notes for user defined amount
		MinimumCurrency_Driver.minCurrency(size, a, amount);
	}

}
