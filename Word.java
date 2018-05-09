/*
Given a string and a non-empty word string, return a version of the original String where all chars have been replaced by pluses ("+"),
except for appearances of the word string which are preserved unchanged.
 
Example plusOut("12xy34", "xy") → "++xy++";
 */
package word;

public class Word {
	public static String plusOut(String str, String word) {
		 String t="";
		  for(int i=0;i<str.length();i++)
		  {
		  if(i<=str.length()-word.length()){
		  String s=str.substring(i,i+word.length());
		  if(s.equals(word))
		  {
		    t+=word;
		    i+=word.length()-1;
		  }
		  else
		  t+="+";
		  }
		  else
		  t+="+";
		  }
		    return t;
		  }

	public static void main(String[] args) {
	
		System.out.println(plusOut("12xy34xyabcxy", "xy"));
	}
}
