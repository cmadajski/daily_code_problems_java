/*
date: 06-28-2022
author: Christian Madajski
problem: given an array of integers, return a new array such that each element at index i of the
		 new array is the product of all the numbers in the original array except the one at i
example: input of [1, 2, 3, 4, 5] should result in an output of [120, 60, 40, 30, 24]
 */

import java.util.*;

class ProductOfInts {
	public static void main(String[] args) {
		if (args.length < 3) {
			System.out.println("Not enough args to meaningfully process. Enter 3 args minimum.");
		} else {
			// make new array to hold int values from args
			int[] nums = new int[args.length];
			// populate array with int values of args
			for (int i = 0; i < args.length; i++) {
				nums[i] = Integer.parseInt(args[i]);
			}
			// declare new array to hold product values
			int[] products = new int[nums.length];
			// calcuate products
			for (int i = 0; i < nums.length; i++) {
				int product = 1;
				for (int j = 0; j < nums.length; j++) {
					if (j != i) {
						product *= nums[j];
					}
				}
				products[i] = product;
			}
			// show results
			System.out.printf("Input array: %s\n", Arrays.toString(nums));
			System.out.printf("Products array: %s\n", Arrays.toString(products));
		}
	}
}