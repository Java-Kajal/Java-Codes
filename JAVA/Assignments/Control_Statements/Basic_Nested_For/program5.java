// Program 3

import java.util.Scanner;

        class Five{
                public static void main(String[] args){

                Scanner sc = new Scanner (System.in);

                System.out.println("Enter the no of row :");

                int row = sc.nextInt();

		  int z=1;

               for(int i=1;i<=row;i++){


                       for (int j=1;j<=3;j++){

                               System.out.print(z );
                        }
                       System.out.println( );

                      z++;

               }
        }
}
