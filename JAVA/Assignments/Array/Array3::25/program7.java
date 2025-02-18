



		 // Check the size of array size is odd and greater than or equal to 5, then print the odd element,else print the even element.

		import java.util.*;

  		class SizeOfArray{
		
		public static void main (String[]args){
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Size of array : ");

		int Size = sc.nextInt();

		int arr[] = new int[Size];

		System.out.println("Enter the element of array : ");

		for( int i = 0; i< Size;i++){

			arr[i] = sc.nextInt();
		}

		if(Size % 2 != 0 && Size >= 5){
			
		System.out.println("Odd elements in the array" );

		for(int num  : arr){
			
		if (num % 2 !=0){
				
		System.out.println(num + " ");
		}
			
		}

		}
		else{			
		System.out.println("Even element in the array");

		for(int num : arr){
			
		if(num % 2 ==0){
			
		System.out.println(num + " ");
			}
			}
		}
		}
		}
	


