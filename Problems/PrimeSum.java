package primesum;

public class PrimeSum {
public static boolean Prime(long num)
{
	for(long i = 2L; i< num/2; i++)
	{
		if(num%i == 0)
	return false;
	}
	return true;
}
	public static void main(String[] args) {
		long sum = 0L;
		for(long i=1L; i < 200000L; i++)
		{
			if(Prime(i))
				sum+=i;
		}
		System.out.println(sum);
	}

}
