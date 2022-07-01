import java.util.Scanner;

public class Leap_year {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Year");
		int year = sc.nextInt();
		
		if (year >= 1582) {
			if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0))
			
				System.out.println(+year +" is a Leap year");
			else 
				System.out.println(+year +" is Not a Leap year");
			
		} else {
				System.out.println("Please enter year greater than 1582");
		}
		// TODO Auto-generated method stub
sc.close();
	}

}
