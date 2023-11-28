package stringconversionexample;

public class StringConversionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create a String
        String originalString = "Hello, World!";

        // Convert String to StringBuffer
        StringBuffer stringBuffer = new StringBuffer(originalString);

        // Convert String to StringBuilder
        StringBuilder stringBuilder = new StringBuilder(originalString);
        
        // Display the results
        System.out.println("Original String: " + originalString);
        System.out.println("StringBuffer: " + stringBuffer);
        System.out.println("StringBuilder: " + stringBuilder);

	}

}
