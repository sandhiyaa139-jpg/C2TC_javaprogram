package polymorphism;

public class MethodOverlodingDemo {
	
		int addition(int a, int b)
		{
			return a + b;
		}
		
		float addition(float a, float b)
		{
			return a + b;
		}

		public static void main(String[] args) {
			
			 MethodOverlodingDemo mod = new  MethodOverlodingDemo();
			
			System.out.println("Addtion is: "+mod.addition(5, 10));
			System.out.println("Addtion is: "+mod.addition(5.5f, 7.7f));
			
			
		}

	}


