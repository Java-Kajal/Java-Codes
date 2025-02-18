



	// Program 3
	


		class Outer{
			class Inner{
				Inner(){
				System.out.println("In Inner Constructure");
				}
			}
			public static void main(String[]args){
			Inner outObj = new Outer().new Inner();
			}
		}
