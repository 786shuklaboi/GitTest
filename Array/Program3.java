import java.util.*;
 
 
 
 
public class Program3 {
    public static class HeartRates {
 
 
 
    //Initialize Variables.
 
    private String firstName, lastName;
    private int month, day, year = 0;
 
 
    //Constructor
 
    public HeartRates(String FName, String LName, int mon, int da, int ye) {
 
        firstName = FName;
        lastName = LName;
        month = mon;
        day = da;
        year = ye;
    }
 
    //Set First Name.
 
    public void setFirstName(String FName) {
        firstName = FName;
    }
    //Get First Name.
    public String getFirstName() {
        return firstName;
    }
 
    //Set Last Name.
    public void setLastName(String LName) {
        lastName = LName;
        }
 
    //Get Last Name.
 
    public String getlastName() {
        return firstName;
    }
    //Set Month, Day and Year
    public void setBirthDate(int mon, int da, int ye) {
        month = mon;
        day = da;
        year = ye;
    }
 //Get Month, Day and Year
    public int getBirthDate() {
        return day/month/year;
    }
 
    public int getAge(){
        return 2015 - year;
        }
 
    public int MaximumHeartRate() {
        return 220 - getAge();
    }
 
    //displays the target heart rate range
    public void targetHeartRate(){
    System.out.print("Target Heart Rate Range: "+ MaximumHeartRate() * 0.5 + " to "+ MaximumHeartRate() * 0.85);
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