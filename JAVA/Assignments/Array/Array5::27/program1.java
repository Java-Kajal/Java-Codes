



		// WAP to check whether the array is in Ascending order or not.

		import java.util.*;

		class AcendingOrder{
		
			public static void main (String[]args){
		
				Scanner sc = new Scanner(System.in);
		
				System.out.println("Enter size of array : ");

				int size = sc.nextInt();

				int arr[] = new int[size];

				System.out.println("Enter element in array : ");
		
				for (int i = 0; i<size; i++){
		
					arr[i] = sc.nextInt();
		
				}
				if(isAscending(arr)){
					
					 System.out.println("Array is in Ascending order");
				}else{
					  System.out.println("Array is not in Ascending order");
				}
			}
			static boolean isAscending(int arr[]){
		
				for(int i = 0; i<arr.length-1; i++){

					if(arr[i] > arr[i + 1]){
		
						return false;
					}
				}
				return true;	
			}
		}
