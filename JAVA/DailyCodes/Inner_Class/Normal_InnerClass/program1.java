



	// Program1
	


	class Outer{
		class Inner{
			Inner(){
			System.out.println("In Inner Constructor");
			}
		}
	}
	class Client{
		public static void main(String[]args){
		Outer.Inner obj = new Outer().new Inner();
		}
	}
