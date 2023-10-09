import java.util.*;
class tempConverter{
  static Scanner sc = new Scanner(System.in); // Scanner Class
  
  // Method to convert Celcius to Fahrenheit
  static double C_F(double C){
    double F = (C * 9/5) + 32;
    return F;
  }
  // Method to read the value of temperature given by the user
  static double input(String word){
    System.out.println("Enter "+word+" value:");
    double val = sc.nextDouble();
    return val;
  }
  
  // Method to print converted value of temperature
  static void output(double val, String word){
    System.out.printf("%s value: %.2f",word,val);
  }
  
  // Driver Method
  public static void main(String args[]){
    System.out.println("1. Celcius to Fahrenheit\n2. Celcius to Kelvin\n"+
              "3. Fahrenheit to Celcius\n4. Fahrenheit to Kelvin\n"+
              "5. Kelvin to Celcius\n6. Kelvin to Fahrenheit\n7. Exit");
    do{
      System.out.println("\nEnter Choice: ");
      int ch = sc.nextInt();
      double num = 0;
      switch(ch){
        case 1: num = input("Celcius");
            output(C_F(num), "Fahrenheit");
            break;
        default: System.out.println("Invalid Input");
      }
    }while(true);  
  }
}