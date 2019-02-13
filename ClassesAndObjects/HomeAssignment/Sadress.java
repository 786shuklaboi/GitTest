class Saddress
{
 String firstName;
 String lastName;
 double monthlySalary;

Address a;

 Saddress()
 {
  firstName= "Akash";
  lastName= "Shukla";
  monthlySalary=100;

  
 }

 Saddress(String f, String l, Double s, String c,String b,Double p)
 {
  
  this.firstName =f;

  this.lastName =l;
  
  this.monthlySalary=s;

  a =   new Address(c,b,p);
  
   
 }
     void info()
     {
      System.out.println("firstName"+firstName+"lastName"+lastName);
     }



     

  public double getMonthlySalary()

  {
    if(this.monthlySalary>0){

      this.monthlySalary=monthlySalary;
           }
    else
      {
      System.out.println("no. is negative");
    
   }

   

    return monthlySalary;

  }
  public void displayAddress()
   {
    System.out.println(a.firstline+""+a.secondline+""+a.pincode);
   }

}