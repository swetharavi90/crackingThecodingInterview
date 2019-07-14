package chap1;
/**
 Write a method to replace all spaces in a string with '%20'. You may assume that the string
has sufficient space at the end to hold the additional characters, and that you are given the "true"
length of the string. (Note: If implementing in Java, please use a character array so that you can
perform this operation in place.)
EXAMPLE
Input: "Mr John Smith ", 13
Output: "Mr%20John%20Smith" 
 **/

import java.util.Scanner;

public class url {
	public static void urlfy(String str, int len) {
		char[] arr = str.toCharArray();
		len = len - 1;
		int n = arr.length;
		for(int i = 0 ; i < n; i++) {
			if(arr[i] == ' ') {
				for(int j = len; j > i; j--) {
					int k = j + 2;
					arr[k] = arr[j];
				}
				len = len + 2;
				arr[i] = '%';
				arr[++i] = '2';
				arr[++i] = '0';
			}			
		}
		System.out.println(new String(arr));
	}

	
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the string");
		String s = input.nextLine();
		System.out.println("Give the true length of the string");
		int n = input.nextInt();
		urlfy(s,n);
		input.close();
	}

}
