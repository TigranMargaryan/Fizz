package countletter;

public class CountLetter {
	public static void main(String[] args) 
	{
		String[] one = {"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		
		String[] ten = {"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};

		String[] strr = {"","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};

		String[] str = {"","one","two","three","four","five","six","seven","eight","nine"};
		
		String[] hundr = {"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen",""};
		String hun = "hundred";
		String sum = "";
		int indexO = 0;
		int indexT = 0;
		int indexN = 0;
		int hundread = 0;
		int indexH = 0;
		int indexall = 0;
		int x=0;
		int indexOO = 0;
		int indexTT = 0;
		int indexNN = 0;
		for(int i=1;i<300;i++)
		{
			if(i<20)
			{
				sum+=one[indexO];
				indexO++;
			}
			
			if(i >= 20 && i <= 99)
			{
				sum+=ten[indexT]+str[indexN];
				indexN++;
				if(indexN == 10)
				{
					indexN = 0;
					indexT++;
				}	
			}
			
			
			if(i >= 100 && i <= 999 && hundread == 0)
				sum += one[indexH]+hun;
				
			hundread++;
			if(hundread == 99)
				hundread = 0;
			
			if(i >= 100 && i <= 999)
			{
				x++;
				sum += one[indexall] + hun + "end" +hundr[indexOO]+strr[indexTT]+str[indexNN];
				
				if(x < 20)
					indexOO++;
			}
			if(x > 20)
				indexNN++;
			if(indexNN == 9)
			{
				indexTT++;
				indexNN = 0;
			}
			if(x == 20)
			{
				indexTT++;
			}
			
			
			if(x == 99)
			{
				indexall++;
				x = 0;
				indexOO = 0;
				indexNN = 0;
				indexTT = 0;
			}
			
			
			
			
		}
		System.out.println(sum);
		
		
		
	}
}
