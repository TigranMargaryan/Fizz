package primeNumber;

public class Prime {
public static boolean prime(int x)
{
	for(int i = 2; i < x;i++ )
	{
		if(x%i ==0)
			return false;
		
		
	}
	return true;
}
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 2; i < 1000000; i++)
		{
			if(prime(i))
				sum++;
			if(sum==10001)
			{
				System.out.println(i);
				break;
			}
		}
		System.out.println(prime(104743));
	}

}
