/**
 * @author Samantha Shurie
 * Assignment 5: Working with Objects
 */
package assignment5objects;


public class MainProgram {
   
    /**
     * Main method implements both the RetailItem and Car classes. This method
     * creates a new instance of the Car class and increases/decreases it's speed
     * field. It also creates three instances of the RetailItem class and prints
     * their fields.
     * @param args 
     */
    public static void main(String[] args) throws InterruptedException {
         
        println("EXERCISE 2: CAR CLASS\n");
        
        Car car = new Car(2010, "Honda");

        println("\tAccelerating...");

        for(int i = 0; i < 5; i++) {
            car.accelerate();
            println("\t\tSpeed is now " + car.getSpeed() + ".");
        }

        println("\n\tApplying Brakes...");

        for(int i = 0; i < 5; i++) {
            car.brake();
            println("\t\tSpeed is now " + car.getSpeed() + ".");
        }
        
        println("");
        
    // End of Exercise 2
        
        
        println("EXERCISE 4: RETAIL ITEM CLASS\n");
        
        String[] description = {"Jacket", "Jeans", "Shirt"};
        Integer[] unitsOnHand = {12, 40, 20};
        Double[] price = {59.95, 34.95, 24.95};
        
        for(int i = 0; i < 3;i++) {
            RetailItem item = new RetailItem(description[i], unitsOnHand[i], 
                price[i]);
            
            println("\tItem " + (i + 1) + ": \tDescription: " +
                    item.getDescription() + "\tOn Hand: " +
                    item.getUnitsOnHand() + "\t Price: $" + item.getPrice());
        }
    }
     
    /**
     * println accepts a string to output
     * @param msg String value
     */
    public static void println(String msg) {
        System.out.println(msg);
    }   //End of Print Line Method
    
}   // End of Class

