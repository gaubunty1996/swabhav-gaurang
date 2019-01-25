package srp.violations;

public class Invoice {
	private int id;
	private String name;
	private double cost;
	private double discount;
	private float gst;

	public Invoice(int id, String name, double cost, double discount, float gst) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.discount = discount;
		this.gst = gst;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCost() {
		return cost;
	}

	public double getDiscount() {
		return discount;
	}

	public float getGst() {
		return gst;
	}

	public double calculateTax() {
		return (gst*cost/100);
	}

	public double calculateDiscountValue() {
		return discount;
	}

	public double calculateTotalCost() {
		return (this.cost + calculateTax() - calculateDiscountValue());
	}
	public void printDetails(){
		System.out.println("Total cost is:"+calculateTotalCost());
	}
}
