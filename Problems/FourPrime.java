package fourprime;



public class FourPrime {

	public static void main(String[] args) {
		 
		for(int i = 2 ;;i++)
		{
			if(fourprime(i + 0) && fourprime(i + 1) && fourprime(i + 2) && fourprime(i + 3))
				System.out.println(i);
		}

	}
	public static boolean fourprime(int x)
	{
		return primenumber(x) == 4;
	}
	public static int primenumber(int x)
	{
		int count =0;
		for (int i = 2, end = (int) Math.sqrt(x); i <= end; i++)
		{
			if(x % i == 0)
			{
				do x/=i;
				while(x % i == 0);
				count++;
				end = (int) Math.sqrt(x);

			}
		}
		if( x > 1)
			count++;
		return count;
	}

}
