/*
 For example, 10! = 10 � 9 � ... � 3 � 2 � 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!
 */

package factorial;

import java.math.BigInteger;

public class Fact {
	
	public static void main(String[] args) {
		BigInteger s = new BigInteger("1");
		int y = 0;
		
		for(int i = 1; i<101; i++)
			s = s.multiply(BigInteger.valueOf(i));
		
		String x = s.toString();
		
		for(int i = 0; i<x.length(); i++)

		 y += Character.getNumericValue(x.charAt(i));
			
			System.out.println("Sum of the digits in the number 100! = "+ y);  // 648
		}
		
		

}

