package powersum;

import java.math.BigInteger;

public class PowerSum {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
			BigInteger num = new BigInteger("0") ;
			BigInteger pow ;
			String s = "";
			String str = "";
			for(int i = 1; i <= 1000; i++)
			{	
				s=s.toString().valueOf(i);
				pow=new BigInteger(s).pow(i);
				num=num.add(pow);
				
			}
			str = num.toString();
			System.out.println(str.substring(str.length()-10, str.length()-1));
	}

}
