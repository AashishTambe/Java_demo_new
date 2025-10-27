package Pack27_10_25;

import java.util.Scanner;

public class temp {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	float C,F;
	System.out.println("Enter the tempereture in degree celcius");
	C=sc.nextFloat();
	F=(C*9/5)+32;
	System.out.println("tempereture in faranheit:"+F);
}
}
