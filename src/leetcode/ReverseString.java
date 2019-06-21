package leetcode;

public class ReverseString {
	
	public static void main(String[] args) 
	{
		char[] inputArr = {'h','e','l','l','o','p'};
		
		new ReverseString().reverseString(inputArr);

	}


	public void reverseString(char[] s) {
		int length = s.length;
		for(int i=0;i<length/2;i++) {
			char c = s[i];		//o(1) memory usage only
			s[i]=s[length-1-i];
			s[length-1-i] = c;
		}
		System.out.println(s);  	    
};
	
}

/*
Write a function that reverses a string. The input string is given as an array of characters char[].

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

You may assume all the characters consist of printable ascii characters.

 
Example 1:

Input: ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 
 *
 *
 
 *****************Personal notes******************
 char and Stringbuilder : If a program creates strings of known length, using a char array is a worthwhile optimization. (mutable way) For more: https://www.dotnetperls.com/char-array-java
 Stringbuilder is generally prefered.
 
 */

	
