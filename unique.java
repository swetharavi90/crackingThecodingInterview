package chap1;
import java.util.Scanner;

// determine if a string has all unique characters
public class unique {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = input.nextLine();
		input.close();
		str = str.replaceAll("\\s",""); 
		int[]test = new int[256];
		Boolean flag = true;
		for(int i = 0; i < str.length(); i++) {
			int j = str.charAt(i);
			test[j] = test[j] + 1;
			if (test[j] > 1) {
				flag = false;
			    break;
			}
		}
		if(flag)System.out.println("unique");
		else System.out.println("Not unique");
	}

}


