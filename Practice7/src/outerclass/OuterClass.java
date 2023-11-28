package outerclass;

public class OuterClass {
	
	private int outerVariable = 10;

    // Inner class
    class InnerClass {
        void displayInner() {
            System.out.println("Inner class method called. Outer variable: " + outerVariable);
        }
    }
 // Static nested class
    static class StaticNestedClass {
        void displayStaticNested() {
            System.out.println("Static nested class method called.");
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating an instance of the outer class
        OuterClass outerInstance = new OuterClass();

        // Creating an instance of the inner class
        InnerClass innerInstance = outerInstance.new InnerClass();
        innerInstance.displayInner();

        // Creating an instance of the static nested class
        StaticNestedClass staticNestedInstance = new StaticNestedClass();
        staticNestedInstance.displayStaticNested();
	}

}
