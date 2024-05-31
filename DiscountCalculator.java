package Demo;

public class DiscountCalculator {

	double discount(double total, int gst) {
		GstCalculator gs = new GstCalculator();
		
		total = total + gs.Get_gst(total);
		double discount = total - total / 2;
		return discount;
	}
}
