import java.util.Scanner;

public class Policy{
    public static void main(String[] args){
        Scanner k = new Scanner(System.in);
        policyHolder test = new policyHolder();
        System.out.print("Please enter the Policy Number: ");
        test.policyNumber = k.nextInt();
        System.out.print("Please enter the Provider Name: ");
        String providerName1 = k.next();
        String providerName2 = k.next();
        test.providerName = providerName1 + " " + providerName2;
        System.out.print("Please enter the Policyholder's First Name: ");
        test.firstName = k.next();
        System.out.print("Please enter the Policyholder's Last Name: ");
        test.secondName = k.next();
        System.out.print("Please enter the Policyholder's Age: ");
        test.age = k.nextInt();
        System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
        test.smokingStatus = k.next();
        System.out.print("Please enter the Policyholder's Height (in inches): ");
        test.personHeight = k.nextDouble();
        System.out.print("Please enter the Policyholder's Weight (in pounds): ");
        test.personWeight = k.nextDouble();
        test.displayInfo();

    }
}