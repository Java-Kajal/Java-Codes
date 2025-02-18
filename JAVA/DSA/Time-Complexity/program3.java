


	// Count betweem two numbers including them
	

	import java.util.*;

	class Count {
	
		static int count (int num1 , int num2){
		
			int count = 0;

			for(int i = 1; i<= 10 ; i++){
			
				count ++;
			}
			return count;
		}
		public static void main(String[] args){
		
		int num1 = 5;

		int num2 = 10;

		int ret =  count(num1,num2);

		System.out.println(ret);
		}
	}
