import java.util.*;
 
 
 
 
public class Program3 {
    public static class HeartRates {
 
 
 
    
 
    private String firstName, lastName;
    private int month, day, year = 0;
 
 
    
 
    public HeartRates(String FirstName, String LastName, int m, int d, int y) {
 
        firstName = FirstName;
        lastName = LastName;
        month = m;
        day = d;
        year = y;
    }
 
    
 
    public void setFirstName(String FirstName) {
        firstName = FirstName;
    }
    
    public String getFirstName() {
        return firstName;
    }
 
    
    public void setLastName(String LastName) {
        lastName = LastName;
        }
 
    
 
    public String getlastName() {
        return firstName;
    }
    
    public void setBirthDate(int m, int d, int y) {
        month = m;
        day = d;
        year = y;
    }
 
    public int getBirthDate() {
        return day/month/year;
    }
 
    public int getAge(){
        return 2014 - year;
        }
 
    public int MaximumHeartRate() {
        return 220 - getAge();
    }
 
    
    public void targetHeartRate(){
    System.out.print("Targeted Heart Rate Range: "+ MaximumHeartRate() * 0.5 + " to "+ MaximumHeartRate() * 0.85);
    }
}
 
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
 
        System.out.println("Enter First Name: ");
        String firstName = input.nextLine();
        System.out.println("Enter Last Name: ");
        String lastName = input.nextLine();
        System.out.println("Enter BirthDate: ");
        int month = input.nextInt();
        int day = input.nextInt();
        int year = input.nextInt();
 
        HeartRates myHeartRate = new HeartRates(firstName, lastName, month, day, year);
        System.out.printf("Name: "+ firstName +", " + lastName);
        System.out.printf("Age in years: \n", myHeartRate.getAge());
        System.out.println("Maximum Heartrate: "+ myHeartRate.MaximumHeartRate());
        myHeartRate.targetHeartRate();
 
    }
 
}