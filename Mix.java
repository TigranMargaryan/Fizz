/*
 Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
 */
package StringMix;

public class Mix {
	public static boolean mix(String str) {
		  if(str.length() <= 2)
		  return false;
		  if(str.substring(1,3).equals("ix"))
		  return true;
		  return false;
		}

	  public static void main( String[] args ) {
		 System.out.println(mix("ni"));			//False
		 System.out.println(mix("pix snacks")); //True
		 System.out.println(mix("nox"));		//False
		 System.out.println(mix("fix"));		//True
	  }
	  }

