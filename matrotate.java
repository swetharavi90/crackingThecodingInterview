package chap1;
/*
Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4
bytes, write a method to rotate the image by 90 degrees. Can you do this in place? 
 */

import java.util.Arrays;
import java.util.Scanner;

public class matrotate {
	public static void rotate(int[][]A, int n) {
		int size = n;
		System.out.println("Before rotate");
		display(A,n);
		int i = 0;
		while(n>1){
			for(int rot = i ; rot < size-1-i; rot++) {
				int j = rot - i;
				int temp = A[i][rot];
				A[i][rot] = A[size-1-i-j][i];
				A[size-1-i-j][i] = A[size-1-i][size-1-i-j];
				A[size-1-i][size-1-i-j] = A[rot][size-1-i];
				A[rot][size-1-i] = temp;
			}						
			n = n - 2;
			i++;			
		}
		System.out.println("After rotate");
		display(A,A[0].length);
	}
	public static void display(int[][] arr, int n) {
		for (int i = 0 ; i < n ; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the size of the matrix");
		int size = input.nextInt();
		int[][] arr = new int[size][size];
		int val = 0;
		for(int i = 0 ; i<size ; i++) {
			for (int j = 0 ; j < size ; j++) {
				arr[i][j] = val++;				
			}
		}
		rotate(arr,size);
		input.close();
	}
	

}
