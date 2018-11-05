package com.Codility;

import java.util.Random;
import java.util.Scanner;

public class CyclicRotation {

	//Muhammet Feyzi Saðlam
	
	/*
	 * 	An array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last element of the array is moved to the first place. For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7] (elements are shifted right by one index and 6 is moved to the first place).
The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times.

Assume that the following declarations are given:

struct Results {
  int * A;
  int N; // Length of the array
};

Write a function:
struct Results solution(int A[], int N, int K);
that, given an array A consisting of N integers and an integer K, returns the array A rotated K times.
For example, given

    A = [3, 8, 9, 7, 6]
    K = 3
the function should return [9, 7, 6, 3, 8]. Three rotations were made:
    [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
    [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
    [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
For another example, given
	 */
	static int k=0; //  rotation count of array
	static int n=0; // length of array
	static Random rnd = new Random();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Please give number of array");

		int n= scan.nextInt();
		System.out.println("please entr rotation number of array");
		int k= scan.nextInt();
		
		int []rotateArray = new int[n]; 
		rotateArray=createRandomArray(rotateArray);
		System.out.println("we will write array elements before rotations");
		writeArray(rotateArray);
		rotateArray=cyclicRotation(rotateArray, n, k);
		System.out.println("we will write array number after rotations");
		writeArray(rotateArray);
		
	}
	private static void writeArray(int[] rotateArray) {
		// TODO Auto-generated method stub
		for (int i = 0; i < rotateArray.length; i++) {
			System.out.println(rotateArray[i]);
		}
	}

	private static int[] cyclicRotation(int[] rotateArray, int n2, int k2) {
		// TODO Auto-generated method stub
		// rotating array via k number.
		int temp = 0;
		int counter = 0;
		while (counter < k2) {
	         temp = rotateArray[rotateArray.length-1];
	        for (int i =  rotateArray.length - 1; +i>0; i--) {
	        	rotateArray[i] = rotateArray[i - 1];
	         }

	        rotateArray[0] = temp;
	         counter++;
		}
		return rotateArray;
	}

	private static int[] createRandomArray(int[] rotateArray) {
		// TODO Auto-generated method stub
	
		// we will create array with random numbers
		for (int i = 0; i < rotateArray.length; i++) {
			  rotateArray[i] = rnd.nextInt(1000);
		}
		return rotateArray;
	}

}
