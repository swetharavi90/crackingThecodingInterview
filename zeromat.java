package chap1;
/*
 * Zero Matrix: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
column are set to 0. 
 */

import java.util.Arrays;

public class zeromat{
	
public static void changemat(int[][]A, int m, int n){
	int [][] zer = new int[m*n][2];
	int index = 0;
	for(int i = 0; i < m; i++){
		for(int j = 0 ; j < n ; j++){
			if (A[i][j] == 0) {
				zer[index][0] = i;
				zer[index][1] = j;
				index++;
			}
		}		
	}
	for(int i = 0 ; i < index ; i++) {
		for(int j = 0; j < n ; j++) {
			A[zer[i][0]][j] = 0;
		}
		for(int j = 0; j < m ; j++) {
			A[j][zer[i][1]] = 0;
		}
	}	
    display(A,m);
}
public static void display(int[][] arr, int n) {
	for (int i = 0 ; i < n ; i++) {
		System.out.println(Arrays.toString(arr[i]));
	}
}
public static void main(String[]args) {
	 int[][] arr = {
			{1,2,0,6,7},
			{4,0,8,9,3},
			{3,6,8,0,4},
			{4,0,8,9,3},
			{3,6,8,5,4},
			{4,0,8,9,3},
			{3,6,8,1,4},
			{4,0,8,9,3},
			{3,6,8,3,4}
			};
	 changemat(arr,9,5);
	}	

}
