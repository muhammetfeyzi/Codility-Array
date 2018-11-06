package com.Codility;

public class OddOccurencesInArray {
	/*
	 * A non-empty array A consisting of N integers is given. 
	 * The array contains an odd number of elements, and each element of the array can be paired with another element 
	 * that has the same value, except for one element that is left unpaired.
	 * 
	 * For example, in array A such that:

  	A[0] = 9  A[1] = 3  A[2] = 9
  	A[3] = 3  A[4] = 9  A[5] = 7
  	A[6] = 9
	the elements at indexes 0 and 2 have value 9,
	the elements at indexes 1 and 3 have value 3,
	the elements at indexes 4 and 6 have value 9,
	the element at index 5 has value 7 and is unpaired.
	Write a function:

	int solution(int A[], int N);
	that, given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.
	 */
	static int []A=new int[7];
	static int N;
	static int res = 0 ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("oddOcuurrencesInarray");
		// Decleare the array 
		A[0]=9;A[1]=3;A[2]=9;A[3]=3;
		A[4]=9;A[5]=7;A[6]=9;
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i]);
		}
		res=solution(A,N);
		System.out.println("\n" + res);
	}
	private static int solution(int[] a, int n) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < a.length; i++) {
			res=res^a[i];	
			
		}
		return res;
		
	}

}
