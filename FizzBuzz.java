/*
 Consider the series of numbers beginning at start and running up to but not including end,
 so for example start=1 and end=5 gives the series 1, 2, 3, 4. Return a new String[] array 
 containing the string form of these numbers, except for multiples of 3, use "Fizz" instead  of the number,
 for multiples of 5 use "Buzz", and for multiples of both 3 and 5 use "FizzBuzz".
 You have to allocate and index into an array instead of just printing, and we vary the start/end instead of just always doing 1..100.
 */
 
package fizzBuzz;

public class FizzBuzz {
	public static String[] fizzBuzz(int start, int end) 
	{
	  String[] str = new String[end-start];
	  
	for(int i = 0, j = start; i < end-start; i++, j++)	
		{
			if( j%3 == 0 && j%5 == 0 )
				str[i] = "FizzBuzz";
			else if( j%3 == 0 )
				str[i] = "Fizz";
			else if( j%5 == 0 )
				str[i] = "Buzz";
			else
				str[i] = String.valueOf(j);
		}
	  return str;
	}

	public static void main(String[] args) {
	int x = 1,y = 16;
		String[] str = new String[y-x];
		str=fizzBuzz(x, y);
		for(int i = 0; i < str.length; i++)
			System.out.print(str[i]+" ");
	}
}
