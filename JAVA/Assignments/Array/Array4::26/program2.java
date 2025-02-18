



		
                // WAP to find the difference between minimum element in an array and maximum element in an array , take input from the user .



                import java.util.*;

                class ArrayDifference{

                public static void main(String[]args){

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter Size Of Array : ");

                int Size = sc.nextInt();

                int arr[] = new int[Size];

                System.out.println("Enter Element of an Array : ");

                for(int i = 0; i<arr.length;i++){

                arr[i] = sc.nextInt();

                }

                int minValue = Integer.MAX_VALUE;

                int maxValue = Integer.MIN_VALUE;

                for(int i = 0; i<arr.length;i++){
		
			 if(arr[i] < minValue){

                minValue = arr[i];

                }
                if(arr[i] > maxValue){

                maxValue = arr[i];
                }
                }
                int difference = maxValue - minValue;

                System.out.println("The Difference between minimum and maximum element is " + difference);
                }
                }

