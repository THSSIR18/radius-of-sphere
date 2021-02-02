import java.util.Scanner;
public class Project3_2
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the radius of the sphere: ");
		double rad = sc.nextDouble();
		double dia= rad * 2;
		double circumfrance = rad * 3.14;
		double volume= (rad * rad * rad)*3.14 * (4.0/3);
		double surface =(rad * rad) * 3.14 * 4;
		System.out.println("The diamiter is: "+ dia);
		System.out.println("The circumfrance is: "+ circumfrance);
		System.out.println("The volume is: "+ volume);
		System.out.println("The surface area is: "+ surface);
		
		
		
	}
}