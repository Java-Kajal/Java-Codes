		



		
                // Given an integer array of size N . Count the no of element having atleast 1 element greater than itself.
                // arr : [2,5,1,4,8,0,8,1,3,8]
                // N : 10
		// Output : 7


		//BFA


                class ArrayDemo{

                public static void main (String[]args){

                int arr[] = new int[]{2,5,1,4,8,0,8,1,3,8};

                int N = 10;

		int count = 0;

                for(int i = 0; i<N; i++){

			for (int j=0; j<N; j++){
			
			if(arr[i] < arr[j]){
			
			count ++;
			break;
		         	}
			}

                    }
			System.out.println(count);

                  }

                }



                // Ittrrations = 10N
                // Time Complexity = O(N)
                // Space Complexity = O(1)
