package castingexample;

public class CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intValue = 10;
        long longValue = intValue;
        
        System.out.println("Implicit Casting (Widening):");
        System.out.println("int value: " + intValue);
        System.out.println("long value: " + longValue);
        
        double doubleValue = 10.5;
        int intFromDouble = (int) doubleValue; 
        
        System.out.println("\nExplicit Casting (Narrowing):");
        System.out.println("double value: " + doubleValue);
        System.out.println("int value from double: " + intFromDouble);

	}

}
