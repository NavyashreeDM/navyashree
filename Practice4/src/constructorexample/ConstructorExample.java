package constructorexample;

public class ConstructorExample {
	
	public ConstructorExample() {
        System.out.println("Default Constructor called.");
    }
	public ConstructorExample(String message) {
        System.out.println("Parameterized Constructor called with message: " + message);
    }
	public ConstructorExample(int number) {
        System.out.println("Constructor with int parameter called. Number: " + number);
    }
	 public ConstructorExample(ConstructorExample original) {
	        System.out.println("Copy Constructor called. Copied message: " + original.getMessage());
	    }
	 public String getMessage() {
	        return "This is a message from the object.";
	    }
	 public static void main(String[] args) {
		 ConstructorExample defaultConstructor = new ConstructorExample();
	        ConstructorExample parameterizedConstructor = new ConstructorExample("Hello, Constructors!");
	        ConstructorExample intConstructor = new ConstructorExample(42);
	        ConstructorExample originalObject = new ConstructorExample("Original Message");
	        ConstructorExample copyConstructor = new ConstructorExample(originalObject);
	        
	        System.out.println("Message from the copied object: " + copyConstructor.getMessage());
	
	}

}
