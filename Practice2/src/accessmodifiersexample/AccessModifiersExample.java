package accessmodifiersexample;

class DefaultAccessClass {
    void display() {
        System.out.println("This is a default access class.");
    }
}

public class AccessModifiersExample {
	
	// Public variable
    public int publicVariable = 10;

 // Private variable
    private int privateVariable = 20;
    
 // Protected variable
    protected int protectedVariable = 30;

    // Default (package-private) variable
    int defaultVariable = 40;
    
    // Public method
    public void publicMethod() {
        System.out.println("Public method called.");
    }

    // Private method
    private void privateMethod() {
        System.out.println("Private method called.");
    }
    
 // Protected method
    protected void protectedMethod() {
        System.out.println("Protected method called.");
    }

    // Default (package-private) method
    void defaultMethod() {
        System.out.println("Default method called.");
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 AccessModifiersExample example = new AccessModifiersExample();

	        System.out.println("Public variable: " + example.publicVariable);
	        System.out.println("Private variable cannot be accessed directly.");

	        System.out.println("Protected variable: " + example.protectedVariable);
	        System.out.println("Default variable: " + example.defaultVariable);

	        example.publicMethod();
	        // example.privateMethod(); // Cannot access private method outside the class
	        example.protectedMethod();
	        example.defaultMethod();

	        // Accessing default access class
	        DefaultAccessClass defaultAccessClass = new DefaultAccessClass();
	        defaultAccessClass.display();
	}

}
