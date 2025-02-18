		



		 // WAP to take a number from user and store each element in an array by inceasing the element by one.

                import java.util.*;

                class IncreaseEle{

                        public static void main (String[]args){

                                Scanner sc = new Scanner(System.in);

                                System.out.println("Enter the Element : ");

                                int size = sc.nextInt();

                                int arr[] = new int[size];

                                System.out.println("Enter element in array : ");

                                for (int i = 0; i<size; i++){

					int digit = Character.getNumericValue(sc.charAt(i));

                                        arr[i] = (digit +1)%10;

                        }

			for(int i = 0; i<size; i++){
			
				System.out.println(arr[i]);		
				
				if(i < size -1){
					
					System.out.println(" , ");

					}
				}
			}
			
		}
