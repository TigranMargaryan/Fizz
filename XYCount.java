/*
  Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
  but not the 'y' in "yellow" (not case sensitive).
  We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it.
  (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)

   Example		countYZ("fez day")  2
				countYZ("day yak")  1
				countYZ("zxyx")     0
 */

package coutletter;

public class XYCount 
{
	public static int count(String str) 
	{
	  int x = 0;
	 
	  str = str.toLowerCase();
	  
	   if(str.charAt(str.length()-1) == 'y' || str.charAt(str.length()-1) == 'z')
	    x++;
	    
	  for(int i = 0; i<str.length()-1; i++)
	  {
	    if((str.charAt(i) == 'y' || str.charAt(i)=='z') && !Character.isLetter(str.charAt(i+1)))
	    x++;
	  }
	      return x;
	}
	public static void main(String[] args) 
	{
		
		System.out.println(count("day fyyyz"));  //2
	}

}
