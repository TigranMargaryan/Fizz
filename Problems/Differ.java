package difference;

public class Differ {

	public static void main(String[] args) {
		 int pov = 0;
		 int  sum = 0;
		for(int i = 1; i <= 100; i++)
		 {
			 sum += i;
			 pov += i*i;
		 }
System.out.println(sum*sum-pov);
	}

}
