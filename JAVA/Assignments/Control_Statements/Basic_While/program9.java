



		
                // WAP to print sum of odd numbers from 150 to 101.



                class SumOfOdd{

                        public static void main(String[]args){

                                int sum = 0;
				int num = 150;

                                        while(num >=101){

                                                if(num % 2 !=0){
							
							sum = sum + num;
					}
                                                 num --;
                                }
                                                System.out.println(sum);

                        }
                }
