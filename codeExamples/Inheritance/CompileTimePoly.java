/**
 * Demonstrating Complie time Polymorphism
 * We implement Compile time polymorphism by using method overloading
 * 
 */


public class CompileTimePoly {


    // method to add two integers
    public int addition(int x, int y) {
      return x + y;
    }
  
    // method to add three integers
    public int addition(int x, int y, int z) {
      return x + y + z;
    }
  
  
    // Main method
    public static void main(String[] args) {
      // Creating an object of the Main method
      CompileTimePoly number = new CompileTimePoly();
  
      // calling the overloaded methods
      int res1 = number.addition(100, 200);
      System.out.println("Addition of two integers: " + res1);
  
      int res2 = number.addition(20, 60, 450);
      System.out.println("Addition of three integers: " + res2);
  
    }
  }