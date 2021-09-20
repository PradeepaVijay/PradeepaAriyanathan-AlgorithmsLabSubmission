package com.greatlearning.driver;
import java.util.Scanner;

public class MinimumCurrency_Driver {
	private static int a[];
//getArray method gets different currency denominations
	public static int[] getArray(int size) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the currency denominations value");
		int currencyValue[] = new int[size];
		for (int i = 0; i < size; i++) {
			currencyValue[i] = sc.nextInt();
		}
		a = currencyValue;
		return currencyValue;
	}
//method to calculate minimum number of currency notes for user defined amount
	public static void minCurrency(int size, int[] currencyValue, int amount) {
		try {
		int[] noteCounter = new int[size];

		for (int i = 0; i < size; i++) {
			if (amount >= currencyValue[i]) {
				noteCounter[i] = amount / currencyValue[i];
				amount = amount - noteCounter[i] * currencyValue[i];
			}
		}

		// Printing the minimum number of notes required 
		System.out.println("Your payment approach in order to give min no of notes will be");
		for (int i = 0; i < size; i++) {
			if (noteCounter[i] != 0) {
				System.out.println(currencyValue[i] + " : " + noteCounter[i]);
			}
		}
		}
		catch (ArithmeticException e) {
			System.out.println(e+"  Invalid input currency 0");
		}
	}
//sort method calls mergesort to sort currency values in descending order
	public static void sort() {
		int[] tempArray = new int[a.length];
		mergeSort(tempArray, 0, a.length - 1);
	}
//merget sort for arranging currency values in descending order
	//Divide the array until single element then call merge method to sort and merge the elements
	public static void mergeSort(int[] tempArray, int lowerIndex, int upperIndex) {
		if (lowerIndex == upperIndex) {
			return;
		} else {
			int mid = (lowerIndex + upperIndex) / 2;
			mergeSort(tempArray, lowerIndex, mid);
			mergeSort(tempArray, mid + 1, upperIndex);
			merge(tempArray, lowerIndex, mid + 1, upperIndex);
		}
	}
//merge method to sort and merge the elements
	public static void merge(int[] tempArray, int lowerIndexCursor, int higerIndex, int upperIndex) {
		int tempIndex = 0;

		int lowerIndex = lowerIndexCursor;
		int midIndex = higerIndex - 1;
		int totalItems = upperIndex - lowerIndex + 1;
		while (lowerIndex <= midIndex && higerIndex <= upperIndex) {
			if (a[lowerIndex] > a[higerIndex]) {
				tempArray[tempIndex++] = a[lowerIndex++];
			} else {
				tempArray[tempIndex++] = a[higerIndex++];
			}
		}

		while (lowerIndex <= midIndex) {
			tempArray[tempIndex++] = a[lowerIndex++];
		}

		while (higerIndex <= upperIndex) {
			tempArray[tempIndex++] = a[higerIndex++];
		}

		for (int i = 0; i < totalItems; i++) {
			a[lowerIndexCursor + i] = tempArray[i];
		}
	}

}
