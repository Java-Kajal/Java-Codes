	



		// WAP to find Second largest element in an array.



                import java.util.*;

                class SecondLargestEle{

                public static void main(String[]args){

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter Size Of Array : ");

                int Size = sc.nextInt();

                int arr[] = new int[Size];

                System.out.println("Enter Element of an Array : ");

                for(int i = 0; i<arr.length;i++){

                arr[i] = sc.nextInt();

                }

                int largest = Integer.MIN_VALUE;

                int secondLargest = Integer.MIN_VALUE;

                for(int i = 0; i<arr.length;i++){

                if(arr[i] > largest){

                secondLargest = largest;

		 largest = arr[i];

                }else if (arr[i] > secondLargest && arr[i] != largest){

                        secondLargest = arr[i];
                }
                }
                System.out.println("The Second largest Element in the array is : " +secondLargest);

                }
                }
