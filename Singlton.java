// Singleton class
class Singleton {
    // Step 1: Create a private static variable to store the single instance
    private static Singleton instance;
//     the variable should store the object of class singleton

    // Step 2: Make the constructor private to prevent direct object creation
    private Singleton() {
        System.out.println("Singleton Instance Created!");
    }

    // Step 3: Provide a public method to return the single instance
    public static Singleton getInstance() {
        if (instance == null) {  // Create instance only if it doesn't exist
            instance = new Singleton();
        }
        return instance;
    }

    // A sample method to demonstrate usage
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}






public class Singlton {
    public static void main(String[] args){
//        in singleton design it allwos us to create the object and make use of it multiple times
        Singleton obj1 = Singleton.getInstance();
        obj1.showMessage();

        // Trying to get another instance
        Singleton obj2 = Singleton.getInstance();

        // Checking if obj1 and obj2 are the same instance
        System.out.println(obj1 == obj2);  // Output: true (Same object)
    }
}
