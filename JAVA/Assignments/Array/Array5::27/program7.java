


		   // WAP to find first composite numbers in an array.

                import java.util.*;

                class CompositeNo{

                        public static boolean isComposite(int num){

                                if(num < 4){

                                return false;

                                }
                                for (int i= 2; i*i<=num; i++){

                                        if(num % i == 0){

                                                return true;
                                        }

                                }
                                return false;
                        }
                        public static void main (String[]args){

                                Scanner sc = new Scanner(System.in);

                                System.out.println("Enter size of array : ");

                                int size = sc.nextInt();

				      int arr[] = new int[size];

                                System.out.println("Enter element in array : ");

                                for (int i = 0; i<size; i++){

                                        arr[i] = sc.nextInt();
                                }
				boolean found = false;

                                for(int i = 0; i<size; i++){

                                        if(isComposite(arr[i])){

						if(found) System.out.print(",");

						System.out.print(arr[i]);

                                                found = true;
                                        }
                                }
						if(!found){

                                		System.out.println("Composite no. not found in array");
				}
                        }
                }
