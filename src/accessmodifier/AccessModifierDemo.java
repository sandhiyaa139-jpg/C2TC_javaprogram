package accessmodifier;

public class AccessModifierDemo {
	public int publicVar = 10;
	protected int protectedvar = 20;
	private int privateVar = 30;
	int defaultvar = 40;
	
	public	void showDetails() {
		System.out.println("Public Variable: "+publicVar);
		System.out.println("Protected Variable: "+protectedvar);
		System.out.println("Private Variable: "+privateVar);
		System.out.println("Default Variable: "+defaultvar);
	}

	public static void main(String[] args) {
		
		AccessModifierDemo amd = new AccessModifierDemo();
		amd.showDetails();
	

	}



}

