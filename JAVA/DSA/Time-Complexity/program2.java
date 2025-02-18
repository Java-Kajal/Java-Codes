
        // Sum Of N Numbers Optimize code

	import java.util.*;
		

        class SumOfN {                                                                                                                                                                                                                                                                                                   static int sum(int num){                                                                                                                                                                                                                                                                                        int add = 0;                                                                                                                                                                                                                                                                                                        return (num*(num+1))/2;                                                                                                                                                                                                                                                                                     }
                	public static void main(String[] args){                                                                                                                                                                                                                                                                         Scanner sc = new Scanner(System.in);
                                                                                                                                                                            int num = sc.nextInt();

                        int ret = sum(num);

                        System.out.println(ret);                                                                                                                    }                                                                                                                                           }                 	
