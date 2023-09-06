package com.pgr.arrays;

import java.util.Arrays;

public class ArraysDemo1 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 60;
		arr[3] = 40;
		arr[4] = 10;//

		// arr[5] = 10; //java.lang.ArrayIndexOutOfBoundsException

		int[] arr1 = { 2, 4, 5, 67, 7, 8, 9 };
		
		for (int it : arr) {
			System.out.println(it);
		}

		System.out.println("=====After Sorting==============");
		//Arrays.sort(arr);
		System.out.println("arr size is " + arr.length);

		// System.out.println("arr1 size is "+arr1.length);

		/*
		 * System.out.println(arr[0]); System.out.println(arr[1]);
		 * System.out.println(arr[2]); System.out.println(arr[3]);
		 * System.out.println(arr[4]);
		 */

		/*
		 * for (int i = 0; i < arr.length; i++) { System.out.println(arr[i]); }
		 */

		for (int it : arr) {
			System.out.println(it);
		}

		/*
		 * int j = 0; while(j<arr.length) { System.out.println(arr[j]); j++; }
		 */

		/*
		 * int j = 0; do { System.out.println(arr[j]); j++; } while (j < arr.length);
		 */
	}

}
