/*
  Given three ints, a b c, one of them is small, one is medium and one is large.
  Return true if the three values are evenly spaced,
  so the difference between small and medium is the same as the difference between medium and large.
  
  Example evenlySpaced(2, 4, 6) 	 //true
		  evenlySpaced(4, 6, 2)  //true
		  evenlySpaced(4, 6, 3)  //false
 */
package evenly;

public class EvenlySpaced {
	
	public static boolean evenlySpaced(int a,int b,int c) 
	{	 
	return (a-b == b-c) || (a-c == c-b) || (a-b == c-a);
	}

	public static void main(String[] args) 
	{

		System.out.println(evenlySpaced(4, 8, 12)); //true
 
	}
}
	
