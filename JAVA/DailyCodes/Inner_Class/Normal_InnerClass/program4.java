



	// Program 4 Nasted Inner Class
	

		

		class Outer{
		 	Outer(){
			System.out.println("In Outer Constructor");
			}

		class Inner1{
		 	Inner1(){
			System.out.println("In Inner1 Constructor");
			}

		class Inner2{
		 	Inner2(){
			System.out.println("In Inner2 Constructor");
			}
	       		}
				
			}
		public static void main(String[]args){
			Outer outobj = new Outer ();
			Inner1 innerobj = outobj.new Inner1();
			Inner1.Inner2 innerobj1 = innerobj.new Inner2();
			Inner1.Inner2 obj = new Outer().new Inner1().new Inner2();
		
		}
		}

