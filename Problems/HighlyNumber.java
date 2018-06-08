package highnumber;

public class HighlyNumber {

	public static void main(String[] args) {
	int num = 0;
	int count = 0;
	long number = 0L;
	int min = 0;
		for(long i = 1L,k =  1L; ; i=i+k)
			{
			System.out.println(i);
			for(long j = 1L; j < i; j++)
			{
				if(i % j == 0)
					count++;
				if(count >= 500)
				{
					number = i;
					break;
				}
			}
			//System.out.println(i);
			k++;
			if(count >= 500)
				break;
			count = 0;
			
			}
		System.out.println(number);
	}

}
