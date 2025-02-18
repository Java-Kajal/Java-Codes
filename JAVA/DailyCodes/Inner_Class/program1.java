



// Program1



          class Outer{
	  	int x = 10;
		void fun(){
		
			System.out.println("In-fun outer");

			}
		class Inner{
			}
			void run(){
			System.out.println("In-fun Inner");
	       	}
		}
		class Client{
		public static void main(String[]args){
		Outer obj = new Outer();
		System.out.println(obj.x);
		obj.fun();
		obj.run();
			}
		}
	  
