/*
 
Given a string, return true if the number of appearances of "is" anywhere in the string 
is equal to the number of appearances of "not" anywhere in the string (case sensitive).

Example equalIsNot("This is not")  false
		equalIsNot("This is notnot") true
 */

package isnot;

public class IsNot {
	public static boolean equalIsNot(String str) {
		int is = 0;
		int not = 0;
		for(int i = 0; i < str.length() - 2; i++) {

		if(str.substring(i,i+3).equals("not"))
		   
		    not++;
		}

		for(int i = 0; i < str.length() - 1; i++) {

		if(str.substring(i,i+2).equals("is")) 
		  
		    is++;
		}

		return is == not;
		}

	public static void main(String[] args) {
		
		System.out.println(equalIsNot("isisnotno7Not")); //false
	
	}

}
