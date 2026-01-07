package interfaceDemo;

public class GreetingExecute {
		public static void main(String[] args) {
			
			//lambda expression
			
			GreetingDemo gd = () -> {
				System.out.println("Hi All! Welcome to the Java Session");
			};
			
			gd.greet();
			

		}

	}
