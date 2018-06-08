package fibanachi1000;

import java.math.BigInteger;

public class Fibonacci1000 {

	public static void main(String[] args) {
		BigInteger a = new BigInteger("1");
		BigInteger b = new BigInteger("1");
		int i = 1;
		while(b.toString().length()!=1000)
		{
			i++;
		
		a = a.add(b);
		b = a.subtract(b);
		System.out.println(b.toString());
		}
		
		System.out.println("i = "+i);
		System.out.println(a.toString());

	}

}
