package Package;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class Password {
    
public static final int passlength = 12;

public static void main(String[] args) throws IOException {
	 
        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        
        
     
        System.out.println("1:Registration");
        System.out.println();
        System.out.println("2:login");
        
        int q = input.nextInt();
        
        if(q == 1)
        	registration();
        else
        if(q == 2)
        		loginin();

        }
    
public static int error(String password,int letter,int number,int symbol) {
	 
	for(int i = 0; i < password.length(); i++) 	//check if password contain  a number,symbol and letter
	{
		char c=password.charAt(i);
		if (is_number(c)) number++ ;
        else if (is_Letter(c)) letter++;
        else if (is_simbol(c)) symbol++;
	}
	if(number == 0)
		System.out.println("Write number 1-9");
	else if(letter == 0 )
		System.out.println("Write letter A-Z");
	else if(symbol == 0)
		System.out.println("Write simbol !@#$%^&*");
	 
	return 0;
}
    public static boolean isValid(String password) {

        if (password.length() < passlength) return false;

      int  letter = 0;
       int  number  = 0;
      int  cimbol = 0;
   
        for (int i = 0; i < password.length(); i++) 
        {

            char ch = password.charAt(i);

            if (is_number(ch)) number++ ;   	//check if password contain number
            else if (is_Letter(ch)) letter++;	// check if contain letter
            else if (is_simbol(ch)) cimbol++;	//check if contain symbol
            
            else return false;
        }

        return (letter >= 2 && number >= 2 && cimbol>=1 );

    }
    public static boolean is_Letter(char ch) 
    {
        ch = Character.toUpperCase(ch);
        return (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122);
    }
    public static boolean is_number(char ch) 
    {
        return (ch >= '0' && ch <= '9');
    }
    public static boolean is_simbol(char ch) 
    {
	return (ch >= 33 && ch <= 47);
    }
     

    public static void registration() throws IOException {			//this method open file and write first password and save it
	try(DataOutputStream f=new DataOutputStream(new FileOutputStream("text.txt")) ){  


		@SuppressWarnings("resource")
		Scanner pass = new Scanner(System.in);

	 System.out.print(
             "1. A password length is not less than 12.\n" +
             "2. A password consists of  letters  digits and symbols.\n" +
             "3. A password must contain at least two digits and one symbol \n" +
             "Input a password : ");
String str;

	int   num = 0,let = 0,sym = 0;
	do {
		 str = pass.nextLine();
	 
error(str, num, let, sym);
      if (isValid(str)) 		//check password if contain digit letter and symbol
      {
    	  System.out.println("Password is valid: " ); 
          break;
      } 
      else 
      {
          System.out.println("Not a valid password: ");
          System.out.println("Try again");
      }
}while(!str.equals("exit"));
	
	  f.writeUTF(str);
	  return ;
	}catch(FileNotFoundException e) 
	{
	    System.out.println("not file ");
	}
      
}

public static void loginin() throws IOException {	// we try to login .We already have a password in file 
	int g = 3;
	do
	{
				try(DataInputStream file = new DataInputStream(new FileInputStream("text.txt")))
			{

			    @SuppressWarnings("resource")
			    
				Scanner loginpass = new Scanner(System.in);
			    System.out.println("write password");
			    System.out.println();
			    String strPass = loginpass.nextLine();
			    String strFilePass = file.readUTF();	
			    
		
			        if(strFilePass.equals(strPass)) //check if password in the file equals  login password 
			        { 
			            System.out.println("Congratulations ");
			            break;
			        }
			        else 
			        {
			        	if(g == 0) 
			        	{
							
							System.out.println("you lost");
							break;
						}
			            System.out.println("wrong password try again,you have "+g+" chance then lost");
			        }
			        
			        	System.out.println();
			        	
			        	--g;
			}catch(FileNotFoundException e) 
				{
			    System.out.println("file not found");
			    return;
				}
	}while(g != -1);
}
}

