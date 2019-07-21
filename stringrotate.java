package chap1;

public class stringrotate {
	public static boolean isrotate(String input, String rotate) {
		if(input.length() != rotate.length()) return false;
		int i = rotate.indexOf(input.charAt(0));
		if(i >-1) {
			int finalpos = rotate.length() - i;			
			return input.substring(finalpos).equals( rotate.substring(0, i));
		}
		return false;		
	}
	
	public static void main(String[]args) {
		System.out.println(isrotate("waterbottle","erbottlewat"));
	}

}
