package chap1;
/**
Given two strings, write a method to decide if one is a permutation of the
other. 
**/
import java.util.Arrays;
import java.util.Scanner;

public class isPermute {
	public static boolean permute(String one, String two) {
		if(one.length() != two.length())return false;	
		char[] str1 = one.toLowerCase().toCharArray();
		char[] str2 = two.toLowerCase().toCharArray();
		Arrays.sort(str1);
		Arrays.sort(str2);
		return Arrays.equals(str1,str2);		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first string");
		String Str1 = input.nextLine();
		System.out.println("Enter the second string");
		String Str2 = input.nextLine();
		System.out.println(permute(Str1,Str2));		
	}

}
