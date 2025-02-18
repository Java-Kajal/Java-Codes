	


    
                // WAP to check the fierst Duplicate number in an array and return its index.

                import java.util.*;

                class DuplicateEle{

                        public static void main (String[]args){

                                Scanner sc = new Scanner(System.in);

                                System.out.println("Enter size of array : ");

                                int size = sc.nextInt();

                                int arr[] = new int[size];

                                System.out.println("Enter element in array : ");

                                for (int i = 0; i<size; i++){

                                        arr[i] = sc.nextInt();

                                }	
				int index = -1;

				for (int i = 0; i<size; i++){

					for(int j = 0; j<size; j++){
				
					if(arr[i] == arr[j]){

						index = j;
						break;
					}
				 }

			}
				 	if(index != -1){
						
						System.out.println("First Duplicate number present at index " + index);
					}else{
					
						System.out.println("No Duplicate element in an array");
				

				}
			}
		}


