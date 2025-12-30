package accessmodifier;

public class TestAccess {
public static void main(String[] args) {
		
	AccessModifierDemo amd = new AccessModifierDemo  ();
		
		System.out.println("Public Variable: "+amd.publicVar);
		System.out.println("Protected Variable: "+amd.protectedvar);
		//System.out.println("Private Variable: "+amd.privateVar);
		System.out.println("Default Variable: "+amd.defaultvar);

	}

}

