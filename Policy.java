public class Policy{
    //setting the class fields
    private int age;
    private int policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private String smokingStatus;
    private double height;
    private double weight;
    
    //setting the non-Arg constructor
    public Policy(){
        age = 0;
        policyNumber = 0;
        providerName = "";
        firstName = "";
        lastName = "";
        smokingStatus = "";
        height = 0.0;
        weight = 0.0;
    }
    //setting constructor
    public Policy(int a, int num, String provName, String fName, String lName, String smokStatus, double h, double w){
        age = a;
        policyNumber = num;
        providerName = provName;
        firstName = fName;
        lastName = lName;
        smokingStatus = smokStatus;
        height = h;
        weight = w;
    }
    //setters
    public void setAge(int a){
        age = a;
    }
    public void setPolicyNumber(int num){
        policyNumber = num;
    }
    public void setProviderName(String provName){
        providerName = provName;
    }
    public void setFirstName(String fName){
        firstName = fName;
    }
    public void setLastName(String lName){
        lastName = lName;
    }
    public void setSmokingStatus(String smokStatus){
        smokingStatus = smokStatus;
    }
    public void setHeight(double h){
        height = h;
    }
    public void setWeight(double w){
        weight = w;
    }
    //getters
    public int getAge(){
        return age;
    }
    public int getPolicyNumber(){
        return policyNumber;
    }
    public String getProviderName(){
        return providerName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getSmokingStatus(){
        return smokingStatus;
    }
    public double getHeight(){
        return height;
    }
    public double getWeight(){
        return weight;
    }
    /**Calculates the Policyholder's BMI
     *@return total BMI
     *
     *  */

    public double getBMI()
    {
    final double CONVFACTOR = 703;
    
    return (weight * CONVFACTOR) / (height * height);
    }

    /**
     * getPrice calculates the total price of the Policy, taking in account the age, smoking status and BMI
     * @return price
     */
    public double getPrice()
    {
    final double BASE_PRICE = 600;
    final double ADDITIONAL_FEE_AGE = 75;
    final double ADDITIONAL_FEE_SMOKING = 100;
    final double ADDITIONAL_FEE_PER_BMI = 20;
    
    final int AGE_THRESHOLD = 50;
    final int BMI_THRESHOLD = 35;
    
    double price = BASE_PRICE;
    
    if(age > AGE_THRESHOLD) //over 50 years
        price += ADDITIONAL_FEE_AGE; //75
        
    if(smokingStatus.equalsIgnoreCase("smoker")) 
        price += ADDITIONAL_FEE_SMOKING; //100
            
    //call the getBMI method
    if(getBMI() > BMI_THRESHOLD) //BMI over 35
        price += ((getBMI() - BMI_THRESHOLD) * ADDITIONAL_FEE_PER_BMI); //additional BMI fee - 20
        
    return price;
    }

    /**Displays information about the Policy
     * @returns set of Strings
     * */
    public void displayInformation()
    {
    System.out.println("Policy Number: " + policyNumber);
    System.out.println("Provider Name: " + providerName);
    System.out.println("Policyholder's First Name: " + firstName);
    System.out.println("Policyholder's Last Name: " + lastName);
    System.out.println("Policyholder's Age: " + age);
    System.out.println("Policyholder's Smoking Status (Y/N): " + smokingStatus);
    System.out.println("Policyholder's Height: " + height + " inches");
    System.out.println("Policyholder's Weight: " + weight + " pounds");
    System.out.printf("Policyholder's BMI: %.2f\n", getBMI());
    System.out.printf("Policy Price: $%.2f\n", getPrice());
    }


}