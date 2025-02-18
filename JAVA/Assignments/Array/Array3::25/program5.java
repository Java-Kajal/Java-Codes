



		// Write a program to convert all the negative numbers into their squares in a given array.
		


		class ConvertSquare{
		
		public static void main (String[]args){
		
		int arr[] = new int[]{-2,5,-6,7,-3,8};

		int N = 6;

		for(int i = 0; i<N; i++){
		
		if(arr[i] < 0){
		
			System.out.println(arr[i]*arr[i]);

		}else{
		
			System.out.println(arr[i]);
		}
		}
		}
		
		}
