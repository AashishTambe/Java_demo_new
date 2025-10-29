package work;

import java.util.Scanner;

public class apple_mango {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a;
		System.out.println("Enter the number");
		a=sc.nextInt();
		if(a%3==0 && a%5==0) {
			System.out.println("Mango And Apple");
		}else if(a%3==0) {
			System.out.println("Mango");
		}else if(a%5==0) {
			System.out.println("Apple");
		}else {
			System.out.println("This Number is Not divisible by 3 And 5");
		}
	}
}
