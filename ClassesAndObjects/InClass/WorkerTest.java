import java.util.*;
public class WorkerTest
{
   public static void main(String[]args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the number of employees:");
      int num=scan.nextInt();
      Worker Worker[]=new Worker[num];
      int i;
      for (i=0;i<num;i++)
      {
         Worker[i] = new Worker();
         System.out.println("Enter the name of Employee:");
         Worker[i].name = scan.nextLine();
         if (i==0) scan.nextLine();
         System.out.println("Enter the Year of Joining:");
         Worker[i].yearOfJoining = scan.nextInt();
         System.out.println("Enter the address of Employee:");
         scan.nextLine();
         Worker[i].address = scan.nextLine();
      }
      System.out.println("Name\t\tYear\t\tAddress");
      for (i=0;i<num;i++)
      {
         Worker[i].displayInfo();
      }
   }
}