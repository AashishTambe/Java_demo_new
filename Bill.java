package Pack27_10_25;

import java.util.Scanner;

public class Bill {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int quantity;
	String name;
	double price,total_amount,final_amount,discount;
	System.out.println("Enter the name of Product");
	name=sc.next();
	System.out.println("Enter the Quantity");
	quantity=sc.nextInt();
	System.out.println("Enter the Price");
	price=sc.nextDouble();
	total_amount=(price*quantity);
	
	System.out.println("-----------------Product Bill-------------------");
	System.out.println("Name Of Product:"+name);
	System.out.println("Quantity of Product:"+quantity);
	System.out.println("Product Price:"+price);
	System.out.println("Total Amount:"+total_amount);
	System.out.println();
	if(total_amount>1000) {
		discount=(total_amount * 5)/100;
		final_amount=total_amount-discount;
		System.out.println("Discount:"+discount);
		System.out.println("Final Amount After Discount:"+final_amount);
	}
	else {
		final_amount=total_amount;
	System.out.println("Final Amount:"+final_amount);
}
}
}
