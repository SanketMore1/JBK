package Demo;

import java.util.Scanner;

public class Operation {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		AdditionCalculator addn = new AdditionCalculator();
		GstCalculator gstn = new GstCalculator();
		DiscountCalculator billing = new DiscountCalculator();

		System.out.println("--- Welcome to Sagar's Java Mart ---");
		int count =0;
		System.out.println("Please enter prices of five items you have purchased :");
		int sum = 0;
		while(sc.hasNext() && count <5) {
			sum = sum+ sc.nextInt();
			count++;
		}
		System.out.println(sum);
		
		//int total = addn.add(10, 20, 30, 20, 20);
		int total = sum;
		System.out.println("Bill is : "+total);

		double with_Gst = total + gstn.Get_gst(total);
		System.out.println("Bill along GST : "+with_Gst);

		double bill = billing.discount(total, 3);

		System.out.println("Final Bill with Discount : "+bill);

	}

}
