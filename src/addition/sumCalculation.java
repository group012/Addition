package addition;

import java.util.Scanner;

public class sumCalculation {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no 1st:");
		int a=sc.nextInt();
		System.out.println("Enter no 2nd:");
		int b=sc.nextInt();
		int sum=a+b;
		System.out.println("Sum: "+sum);
		
	}

}
