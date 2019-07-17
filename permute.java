package chap1;
/**
Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A permutation
is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.
1.5
1.6
EXAMPLE
Input: Tact Coa
Output: True 
 **/

import java.util.Hashtable;
import java.util.Scanner;

public class permute {
 public static boolean isPermute(String str){
	 int count = 0;
	 str = str.toLowerCase().replaceAll("\\s","");
	 Hashtable<Character,Integer> hash =  new Hashtable<Character,Integer>();
	 for(int i=0; i<str.length();i++) {
		 if (hash.containsKey(str.charAt(i))){
			 hash.put(str.charAt(i),hash.get(str.charAt(i))+1);			 		 
		 }
		 else {
			 hash.put(str.charAt(i),1);
		 }
		 if(hash.get(str.charAt(i)) % 2 == 1) {
			 count++;
		 }
		 else {
			 count--;
		 }
	 }
	 hash.entrySet().forEach(entry->{
		    System.out.println(entry.getKey() + " " + entry.getValue());  
		 });
	 return count <= 1;
 }
 
 public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 System.out.println("enter the string");
	 String s = input.nextLine();
	 System.out.println(isPermute(s));
	 input.close();
 }
}
