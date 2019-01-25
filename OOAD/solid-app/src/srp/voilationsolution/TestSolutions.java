package srp.voilationsolution;

public class TestSolutions {

	public static void main(String[] args) {
		Invoice invoice = new Invoice(55, "Banana", 66, 15, 5);
		InvoicePrinter invoicePrinter = new InvoicePrinter();
		invoicePrinter.printDetails(invoice);
	}

}
