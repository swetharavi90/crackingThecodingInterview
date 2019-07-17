package chap1;
/*
There are three types of edits that can be performed on strings: insert a character,
remove a character, or replace a character. Given two strings, write a function to check if they are
one edit (or zero edits) away.
EXAMPLE
pale, ple -> true
pales, pale -> true
pale, bale -> true
pale, bake -> false
 */

import java.util.Scanner;

public class oneedit {
	public static boolean isEdit(String s1, String s2) {
		int count = 0;
		if(Math.abs(s1.length() - s2.length()) > 1) {
			return false;
		}
		int i = 0 , j=0;
		while(i<s1.length() && j<s2.length()){
				if(s1.charAt(i) != s2.charAt(j)) {
					count++;
					if(s1.length() > s2.length()) {
						i++;
						continue;
					}
					else if(s2.length() > s1.length()) {
						j++;
						continue;
					}			
				}
				i++;
				j++;
						
			}
		
		System.out.println(count);
		return count<=1;
	}
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 System.out.println("enter the string");
		 String str1 = input.nextLine();
		 System.out.println("enter the string");
		 String str2 = input.nextLine();
		 System.out.println(isEdit(str1,str2));
		 input.close();
	 }

}
