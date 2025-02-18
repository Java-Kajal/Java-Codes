


		// Given an array of size N. reverse thr array without using extra space.
		// Space Complexity : O(1)
		// Arr : [8,4,1,3,9,2,6,7]
		// Output : [7,6,2,9,3,1,4,8]
		

		// Optimize Code


		class ArrayDemo{
		
		public static void main (String[]args){
		
		int arr[] = new int[]{8,4,1,3,9,2,6,7};

		int N = 8;

		int i = 0;

		int j = N-1;

		while(i<j){
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

		i++;
		j--;
			 
		}

		for(int i = 0; i<N; i++)
		System.out.println(arr[i]);
		}
		}



		// itterations = N/2
		// Time Complexity = O(N)
		// Space Complexity = O(1)
