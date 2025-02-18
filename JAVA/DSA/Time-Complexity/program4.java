


	      // Count betweem two numbers including them Optimize Code


        import java.util.*;

        class Count {

                static int count (int num1 , int num2){

                 int count = 0; 
   		 
		 return(num2-num1+1);		 
		}
                public static void main(String[] args){

                int num1 = 5;

                int num2 = 10;

                int ret =  count(num1,num2);

                System.out.println(ret);
                }
        }
