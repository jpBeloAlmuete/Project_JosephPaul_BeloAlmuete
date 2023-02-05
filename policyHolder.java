import java.lang.Math;

public class policyHolder{
    //Policy Number
//Provider Name
//Policyholder’s First Name
//Policyholder’s Last Name
//Policyholder’s Age
//Policyholder’s Smoking Status (will be “smoker” or “non-smoker”)
//Policyholder’s Height (in inches)
//Policyholder’s Weight (in pounds) 
    int policyNumber, age;
    String providerName, firstName, secondName, smokingStatus;
    double personHeight, personWeight, policyHolderPrice;

//setting up the no arg constructor
 public policyHolder(){
    policyNumber = 0;
    age = 0;
    providerName = "none";
    firstName = "name1";
    secondName = "name2";
    smokingStatus = "tbd";
    personHeight = 0.0;
    personWeight = 0.0;
    policyHolderPrice = 600.0;
 }
 //setting up a constructor that initializes the necessary values
 public policyHolder(int plcyNum, int personAge, String prvdrName, String fstName, String scndName, String smkngStatus, double hght, double wght){
    policyNumber = plcyNum;
    age = personAge;
    providerName = prvdrName;
    firstName = fstName;
    secondName = scndName;
    smokingStatus = smkngStatus;
    personHeight = hght;
    personWeight = wght;
 }
//writting the setters and getters
 public void setPolicyNumber(int plcyNum){
    policyNumber = plcyNum;
 }
 public void setAge(int personAge){
    age = personAge;
 }
 public void setProviderName(String prvdrName){
    providerName = prvdrName;
 }
 public void setFirstName(String fstName){
    firstName = fstName;
 }
 public void setSecondName(String scndName){
    secondName = scndName;
 }
 public void setSmokingStatus(String smkngStatus){
    smokingStatus = smkngStatus;
 }
 public void setPersonHeight(double hght){
    personHeight = hght;
 }
 public void setPersonWeight(double wght){
    personWeight = wght;
 }
 
 public int getPolicyNumber(){
    return policyNumber;
 }
 public int getAge(){
    return age;
 }
 public String getProviderName(){
    return providerName;
 }
 public String getFirstName(){
    return firstName;
 }
 public String getSecondName(){
    return secondName;
 }
 public String getSmokingStatus(){
    return smokingStatus;
 }
 public double getPersonHeight(){
    return personHeight;
 }
 public double getPersonWeight(){
    return personWeight;
 }

 //BMI method that calculates the BMI value
 public double BMIcalculator(){
    return (personWeight*703)/(personHeight*personHeight);
 }
 //method that responds to set conditions and add fees in response
 public double conditionChecker(){
    if (this.age>50){
        policyHolderPrice = policyHolderPrice + 75;
    }
    if (this.smokingStatus.equals("smoker") || this.smokingStatus.equals("Smoker")){
        policyHolderPrice = policyHolderPrice + 100;
    }
    if (this.BMIcalculator()>35){
        policyHolderPrice = policyHolderPrice + ((this.BMIcalculator()-35)*20);
    }
    return policyHolderPrice;
 }
 public void displayInfo(){
    System.out.println("Policy Number: " + this.policyNumber);
    System.out.println("Provider Name: " +this.providerName);
    System.out.println("Policyholde's First Name:" +this.firstName);
    System.out.println("Policyholder's Last Name:" +this.secondName);
    System.out.println("Policyholder's Age:" +this.age);
    System.out.println("Policyholder's Smoking Status: " +this.smokingStatus);
    System.out.println("Policyholder's Height: "+this.personHeight+ " inches");
    System.out.println("Policyholder's Weight: "+this.personWeight + " pounds");
    System.out.println("Policyholder's BMI: "+String.format("%,2.2f" , this.BMIcalculator()));
    System.out.println("Policy Price: $"+String.format("%,2.2f" , this.conditionChecker()));
 }
}