package diamondexample;

interface Animal {
    default void sound() {
        System.out.println("Animal makes a sound");
    }
}
interface Mammal extends Animal {
    default void sound() {
        System.out.println("Mammal makes a sound");
    }
}

interface Reptile extends Animal {
    default void sound() {
        System.out.println("Reptile makes a sound");
    }
}

class Platypus implements Mammal, Reptile {
    // Resolve the diamond problem by providing its own implementation
    @Override
    public void sound() {
        System.out.println("Platypus makes a sound");
    }
}
public class DiamondProblemExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Platypus platypus = new Platypus();
	        platypus.sound(); // Outputs: Platypus makes a sound
	}

}
