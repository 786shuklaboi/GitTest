import java.util.Scanner.*; 
class Lecture5 
{
	double radius;

	double findArea() {
		return radius * radius * 3.14;
        


		}

void displayArea () {
	System.out.println("Area = " + findArea());
}

void askvalue()
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Radius");
	radius = scan.newInt();
}
}