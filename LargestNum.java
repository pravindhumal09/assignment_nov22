package com.assignment.nov22;


	/**
	 * @author 799197
	 *.       Find highest no between given 3 numbers e.g 5, 8, 2  O/P- 8 is highest no
	 */
	public class LargestNum {

		public static void main(String[] args) {
			int[] arr = new int[] {5,8,2};
			int max = arr[0];
			for(int i=1; i<arr.length; i++)
			{
			   if(arr[i]>max)
				   max=arr[i];
			}
			System.out.println(+max);
		}

	}


