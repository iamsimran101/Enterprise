public class rectangle {
    private static rectangle instance;
    
    // Private constructor to prevent instantiation
    private rectangle() {
        // Initialization code here
    }
    
    // Public method to provide access to the instance
    public static rectangle getInstance() {
        if (instance == null) {
            instance = new rectangle();
        }
        return instance;
    }
     
    public void displayMessage() {
        System.out.println("design rectangle accessed!");
    } // Other methods and properties of the singleton class can be added here
}

public class circle {
    public static void main(String[] args) {
        // Access the singleton instance (i.e:- rectangle) and call a method
        rectangle instances = rectangle.getInstance();
        instances.displayMessage(); 

        rectangle instances2 = rectangle.getInstance();
        instances2.displayMessage(); 
    }
}