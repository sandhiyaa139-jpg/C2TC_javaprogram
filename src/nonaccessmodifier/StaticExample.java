package nonaccessmodifier;

public class StaticExample {

	
		
		//static variable
		
		static int count;
		
		int variable; // instance variable
		
		//static block

		static {
			
			count = 15;
			
			//variable = 20;
			
			System.out.println("Showing the static vatiable count: "+count);
		}
		
		
		//static method
		static void display() {
			System.out.println("Displaying the static method with count: "+count);
		}
		
		
		public static void main(String[] args) {
			
			System.out.println("Printing the main method");

			display();
		}

	}
