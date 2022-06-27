/*
date: 06-27-2022
author: Christian Madajski
problem: Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 */

import java.util.Arrays;

class AddUpToK {
	public static void main(String[] args) {
		boolean addUpToK = false;
		// save value of k to int
		int k = Integer.parseInt(args[0]);
		// get args saved into array (args[0] is reserved for k)
		int[] nums = new int[args.length - 1];
		for (int i = 0; i < args.length - 1; i++) {
			nums[i] = Integer.parseInt(args[i + 1]);
		}
		/* the complexity of this solution is slightly less than n^2 since the outer loop is n but
		the inner loop is decreasing by one each iteration. So for n=6, a true n^2 = 36 iterations
		while this solution results in n + (n - 1) + (n - 2) ... 0 = 21 */
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == k) {
					addUpToK = true;
					break;
				}
			}
			if (addUpToK == true) {break;}
		}
		// print out result
		System.out.printf("Do any of the values in the array %s add up to %d: %b", Arrays.toString(nums), k, addUpToK);
	}
}