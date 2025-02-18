


		// Write a program to add 15 in all elements of the array and print it.


		class ArrayAddElement{
		
			public static void main(String[]args){
			
				int arr[] = new int[]{10,20,30,40,50,60};
				
				int N = 6;

				int add = 0;

				for(int i =0; i<N; i++){
				
				add = arr[i] + 15;

				System.out.println(add);
				}
			}
		}
