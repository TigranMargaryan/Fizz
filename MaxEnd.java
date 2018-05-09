/*
 Given an array of ints length 3, figure out which is larger, the first or last element in the array,
  and set all the other elements to be that value. Return the changed array.
  
  Example    maxEnd3([1, 2, 3])  [3, 3, 3]
			maxEnd3([11, 5, 9])  [11, 11, 11]
			maxEnd3([2, 11, 3])  [3, 3, 3]
 */
package maxEnd;

public class MaxEnd {
	public static int[] maxEnd3(int[] nums) {
		  int max=nums[0];
		  
		   if(nums[nums.length-1]>max)
		   max=nums[nums.length-1];
		   
		  
		  for(int i=0;i<nums.length;i++)
		  {
		    nums[i]=max;
		  }
		  return nums;
		}

	public static void main(String[] args) 
	{
		
		int[] x= {4,80,11};
		x=maxEnd3(x);
		for(int i = 0; i < x.length; i++)
		{
			System.out.print(x[i]+" "); //11 11 11
		}
	}

}
