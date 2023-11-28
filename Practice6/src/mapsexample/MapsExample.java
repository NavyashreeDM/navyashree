package mapsexample;
import java.util.HashMap;
import java.util.Map;
public class MapsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Creating a HashMap
        Map<String, Integer> studentScores = new HashMap<>();
        
     // Adding key-value pairs
        studentScores.put("Alice", 90);
        studentScores.put("Bob", 85);
        studentScores.put("Charlie", 92);
        studentScores.put("David", 88);
        
     // Displaying the initial map
        System.out.println("Initial Map:");
        displayMap(studentScores);
        
     // Updating the value for a specific key
        studentScores.put("Bob", 87);

     // Displaying the map after an update
        System.out.println("\nMap after updating Bob's score:");
        displayMap(studentScores);

        // Removing a key-value pair
        studentScores.remove("Charlie");
        
     // Displaying the map after removing a key-value pair
        System.out.println("\nMap after removing Charlie's score:");
        displayMap(studentScores);

        // Checking if a key exists
        String studentName = "Alice";
        if (studentScores.containsKey(studentName)) {
            System.out.println("\n" + studentName + "'s score: " + studentScores.get(studentName));
        } else {
            System.out.println("\n" + studentName + " not found in the map.");
        }
    }
	
	// Helper method to display the contents of a map
    private static void displayMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


	}

}
