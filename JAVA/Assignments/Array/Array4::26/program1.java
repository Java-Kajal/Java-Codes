


		
		 // WAP to take input from the user for size and elements of array.where you have to print the average of array element
		 // (array should be integers)



                import java.util.*;

                class ArrayAverage{

                public static void main(String[]args){

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter Size of Array ");

                int size = sc.nextInt();

                int arr[] = new int[size];

                int sum =0;

                System.out.println("Enter element of an Array : ");

                for(int i =0; i<size; i++){

                arr[i] = sc.nextInt();

                sum = sum + arr[i];
                }
                double average = (double) sum / size;

                System.out.println("Array Element Average is i: " + average);
                }
                }
