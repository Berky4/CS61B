public class Dessert {
    // Instance variables
    private int flavor;
    private int price;
    
    // Static variable to keep track of the number of desserts created
    private static int numDesserts = 0;
    
    // Constructor
    public Dessert(int flavor, int price) {
        this.flavor = flavor;
        this.price = price;
        numDesserts++; // Increment the number of desserts
    }
    
    // Method to print the dessert details and the total number of desserts
    public void printDessert() {
        System.out.println(flavor + " " + price + " " + numDesserts);
    }
    
    // Main method to print a specific message
    public static void main(String[] args) {
        System.out.println("I love dessert!");
    }
}
