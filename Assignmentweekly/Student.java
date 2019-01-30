public class Student{
	int i;
	int j;
	int k;
    String firstName;
    String lastName;
    String addr;
    String dob;     //Date of Birth
    String[] skills;
    Qualification qual[];
    String projects[];
    String eMail;
    String contactNo;
    Student(){
	firstName="";
	lastName="";
	addr=null;
	dob="";
	skills=null;
	qual=null;
	projects=null;
	eMail="";
	contactNo="";
}
Student(String firstName,String lastName,String addr,String dob,String skills[],Qualification qual[],String projects[],String email,String contactNo)
{
	this.firstName=firstName;
	this.lastName=lastName;
	this.addr=addr;
	this.dob=dob;
	this.skills=skills;
	this.qual=qual;
	this.projects=projects;
	this.eMail=eMail;
	this.contactNo=contactNo;
}
void Displaystudent(){
	System.out.println(firstName);
	System.out.println(lastName);
	System.out.println(addr);
	System.out.println(dob);
	for(j=0;j<skills.length;j++)
	{
		System.out.println(skills);
	}
	for(i=0;i<qual.length;i++)
	{
		qual[i].Displayqual();
	}
	for(k=0;k<projects.length;k++)
	{
		projects[k].DisplayProject();
	}
	System.out.println(eMail);
	System.out.println(contactNo);
}
}