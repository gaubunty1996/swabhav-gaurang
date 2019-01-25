package srp.voilationsolution;
import srp.voilationsolution.Invoice;

public class InvoicePrinter {

	public void printDetails(Invoice invoice){
		System.out.println("Total cost is:"+invoice.calculateTotalCost());
	}

}
