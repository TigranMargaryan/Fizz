package doublelong;

public class Dlong {

	public static void main(String[] args) {
		double x=1;
		int h=0;
		for(int i=1 ; i <= 100 ; i++)
			{
			x*=i;
			
			}
		while(x>0) 
		{
			x/=10;
			h++;
		}
		System.out.println(h);
		System.out.print(x);

	}

}
