package chap1;
/*
Implement a method to perform basic string compression using the counts
of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the
"compressed" string would not become smaller than the original string, your method should return
the original string. You can assume the string has only uppercase and lowercase letters (a - z). 
 */

import java.util.Scanner;

public class StringCompress {
	public static String compress(String str) {
		StringBuilder sbr = new StringBuilder();
		for (int i = 0 ; i < str.length(); i++) {
			int count = 1;
			while( i < str.length()-1 && str.charAt(i) == str.charAt(i+1) ) {
				count++;
				i++;
			}
			sbr.append(str.charAt(i)).append(count);
		}
		return sbr.length() < str.length()? sbr.toString():str;
	}
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 System.out.println("enter the string");
		 String str1 = input.nextLine();
		 System.out.println(compress(str1));
	}

}
