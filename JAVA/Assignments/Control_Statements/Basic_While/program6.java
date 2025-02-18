




		
                // WAP to print only consonant alphabets from A to Z , But there must not be any vowel in the output.



                class ConsonantAlphabets{

                        public static void main(String[]args){

                                char ch = 'A';
			
                                        while(ch <='Z'){

                                                if(ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U'){

                                                 System.out.print(ch + " ");
                                       }
                                                 ch ++;
                                }
                                                System.out.println();

                        }
                }
