/*
 The decimal number, 585 = 1001001001 (binary), is palindromic in both bases.

Find the sum of all numbers, less than one million, which are palindromic in base 10 and base 2.

(Please note that the palindromic number, in either base, may not include leading zeros.)
 */

package binary;

public class Binary {
	
	private static int equal(int x)   // numbers rotate
	{
		int num = 0;
		while(x >= 1)
		 {
			 num = num * 10 + (x % 10);
			 x/=10; 
		 }
		return num;
	}
	private static boolean Twoside(int a,String str)   //check if numbers rotate equals normal number  and string too
	{
		int num = equal(a);
		int digit = a;
		String strbin = "";
		
		for(int i = str.length() - 1; i >= 0;i--)
		{
			strbin += str.charAt(i);
		}
 
		 if ((num == digit) && (str.equals(strbin)))
			 return true;
		
		 return false;
	}
	
	public static void main(String[] args) {
		
		int sum = 0;
		
		for ( int i = 1 ; i < 1000000; i++)
		{
			if(Twoside(i,Integer.toString(i,2)))  // count all numbers witch normal equal rotate and witch binary equal rotate 
			{
				sum += i;
			}
		}
		
		System.out.println(sum);	// result is 872187
		 
	}

}
