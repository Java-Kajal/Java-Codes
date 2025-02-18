




                // WAP to find the second minimum element in an array.

                import java.util.*;

                class SecondMinEle{

                        public static void main (String[]args){

                                Scanner sc = new Scanner(System.in);

                                System.out.println("Enter size of array : ");

                                int size = sc.nextInt();

                                int arr[] = new int[size];

                                System.out.println("Enter element in array : ");

                                boolean isPalindrome = true;

                                for (int i = 0; i<size; i++){

                                        arr[i] = sc.nextInt();

                        }		
			
				int minEle = Integer.MAX_VALUE;
				
				int secondMinEle = Integer.MAX_VALUE;

				for(int num : arr){
				
					if(num < minEle){

						secondMinEle = minEle;

						minEle = num;

					}else if(num > minEle && num <secondMinEle){
					
						secondMinEle = num;
					
					}			
				}
				if(secondMinEle == Integer.MAX_VALUE){
				
					System.out.println("No second minimum element found ");
				}else{

				System.out.println("The second minimum Element in array is :" + secondMinEle);
				}
			}
		}

