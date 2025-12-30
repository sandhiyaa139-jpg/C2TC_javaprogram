package interfaceDemo;
	interface Fruits{
		
		 void sweet() ; //declaration
		 
		 //void sour();
			
		}



		public class InterfaceExample implements Fruits {

			public void sweet() {
				System.out.println("The fruits are sweet!!!"); //implementation
			}
			
			
			
			public static void main(String[] args) {
				
				
				InterfaceExample obj1 = new InterfaceExample();
				obj1.sweet();

			}

		}
