




		
                // WAP to check whether the user given no. occurs more than two times or equal to 2 .



                import java.util.*;

                class NumberOccurs{

                public static void main(String[]args){

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter Size Of Array : ");

                int size = sc.nextInt();

                int arr[] = new int[size];

                System.out.println("Enter Element of an Array : ");

                for(int i = 0; i<arr.length;i++){

                arr[i] = sc.nextInt();

                }
		System.out.println("Enter the number to check : ");

		int number = sc.nextInt();

                int count = 0;

                for (int i = 0; i<size; i++){

                        if (arr[i] == number ){

			           count ++;

			}
		}
		if(count > 2){
		
		System.out.println(number + " occurs more than 2 times : ");
		}
		else if(count == 2){

		System.out.println(number + " occurs 2 times ");
		
		}
                else {


                System.out.println(number + " occurs less than 2 times ");
                }
                }
                }
