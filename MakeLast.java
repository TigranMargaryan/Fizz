/*
 Given an int array, return a new array with double the length where its last element is the same as the original array,
 and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's.
 */
package problems;

public class MakeLast {
	public static int[] makeLast(int[] y) 
	{
		  int[] x=new int[y.length*2];
		  for(int i =0 ;i < x.length; i++) 
		  {
			  x[i] = 0;
			  if(x[i] == x[x.length-1]) 
			  {
				  x[x.length-1] = y[y.length-1];
			  break;
			  }
		  }
		  return x;
    }	
	  public static void main( String[] args ) {
	int[] x= {1,2,3,6};
	
	x=makeLast(x);
	for(int i=0;i<x.length;i++)
	{
		System.out.print(x[i]);
	}
	  }
	  }

