import java.util.Scanner;

public class PolicyDemo{
    public static void main(String[] args){
        //declare variables
      int policyNumber;
      String providerName;
      String firstName;
      String lastName;
      int age;
      String smokingStatus;
      double height;
      double weight;
      Scanner keyboard = new Scanner(System.in);
   
      //prompt the user to enter information about the Policy   
      System.out.print("Please enter the Policy Number: ");
      policyNumber = keyboard.nextInt();
            
      System.out.print("Please enter the Provider Name: ");
      providerName = keyboard.next();
      
      System.out.print("Please enter the Policyholder's First Name: ");
      firstName = keyboard.next();
      
      System.out.print("Please enter the Policyholder's Last Name: ");
      lastName = keyboard.next();
      
      System.out.print("Please enter the Policyholder's Age: ");
      age = keyboard.nextInt();

      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      smokingStatus = keyboard.next();
      
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      height = keyboard.nextDouble();
      
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      weight = keyboard.nextDouble();
      
      //create a Policy object
      Policy policy = new Policy(age, policyNumber, providerName, firstName, lastName, smokingStatus, height, weight);
      
      //put a blank line before the output
      System.out.println();
      policy.displayInformation();
    }
}