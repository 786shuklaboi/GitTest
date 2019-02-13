class Saddresstest
{
	public static void main(String[] args) {
		Saddress e1 = new Saddress();
		e1.info();
		e1.getMonthlySalary();


		 double yearlysalary=e1.getMonthlySalary()*12;
          System.out.println("Yearly Salary: "+yearlysalary);
         double salaryraise=yearlysalary*0.10;

		
		System.out.println("10 % raise on yearly salary:"+(yearlysalary+salaryraise));

		
		Saddress e2= new Saddress("Akash","Shukla",100,"786/9","Gurgaon",122001);
	
	            e2.info();
				e2.getMonthlySalary();
				e2.displayAddress();
				 yearlysalary=e2.getMonthlySalary()*12;
				System.out.println("Yearly Salary:"+yearlysalary);
				 salaryraise=yearlysalary*0.10;

		
		System.out.println("10 % raise on yearly salary:"+(yearlysalary+salaryraise));




		
	}
}