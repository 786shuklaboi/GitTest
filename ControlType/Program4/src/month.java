import javax.swing.JOptionPane;
public class month
{
	public static void main(String[] args) {
	
	int num = Integer.parseInt (JOptionPane.showInputDialog ("Enter any number equal to or between 1-12 to display the month"));
	switch (num)
	{ 
		case 1 :
		System.out.println("The 1 shows January");
		case 2 :
		System.out.println("The 2 shows February");
		case 3 :
		System.out.println("The 3 shows March");
		case 4 :
		System.out.println("The 4 shows April");
		case 5 :
		System.out.println("The 5 shows May");
		case 6 :
		System.out.println("The 6 shows June");
		case 7 :
		System.out.println("The 7 shows July");
		case 8 :
		System.out.println("The 8 shows August");
		case 9 :
		System.out.println("The 9 shows September");
		case 10 : 
		System.out.println("The 10 shows October");
		case 11 :
		System.out.println("The 11 shows November");
		case 12 :
		System.out.println("The 12 shows December");
		break;
		default:
		System.out.println("This is invalid");

	}
	} 
}