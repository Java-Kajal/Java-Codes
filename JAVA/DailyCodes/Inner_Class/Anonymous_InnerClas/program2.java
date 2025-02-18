



	// Program 2           Error
	


		class Demo{

		  void fun(){

		  	System.out.println("In fun Demo");
		  }

		}
			class Outer{
				
				public static void main (String[]args){

					 Demo obj = new Demo(){
				
		 				void run(){

		 				System.out.println("In Run Outer$1");

		 				}
		 			};
		

						obj.fun();

						obj.run();
						}
					}



		// new Demo(){
		// void run(){
		// System.out.println("In Run Outer $1");
		// }
		// }.run();
		// }
