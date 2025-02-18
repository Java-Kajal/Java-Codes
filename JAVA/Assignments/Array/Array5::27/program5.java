


		
                // WAP to print count of digit present in an array.

                import java.util.*;

                class DigitCount{

                        public static void main (String[]args){

                                Scanner sc = new Scanner(System.in);

                                System.out.println("Enter size of array : ");

                                int size = sc.nextInt();

                                int arr[] = new int[size];

                                System.out.println("Enter element in array : ");

                                for (int i = 0; i<size; i++){

                                        arr[i] = sc.nextInt();

                                }
				for(int i = 0; i<size; i++){
					
					int digitcount = String.valueOf(arr[i]).length();
					
						System.out.print(digitcount);

						if(i != size-1){
				
						System.out.print(",");
					}
				}
			}
		}
