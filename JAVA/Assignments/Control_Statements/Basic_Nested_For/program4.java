		


		//Pattern Code 4

		

		import java.util.Scanner;

        	class Pattern4{

                	public static void main(String[]args){

                		Scanner sc = new Scanner(System.in);

                		System.out.println("Enter the no of row:");

                		int row = sc.nextInt();

                                for(int i=1;i<=row;i++){

					int z = 1;

                                        for(int j=1;j<=row;j++){

                                                System.out.print(z++ );

                                        }

                                        System.out.println( );

                                        z--;
				}
			}
		}
