package srp.testvoilations;

import com.acp.voilation.FestivalType;
import com.acp.voilation.FixedDeposit;

public class TestFixedDeposit {

	public static void main(String[] args) {
		FixedDeposit fixedDeposit = new FixedDeposit(2, "abc", 100000, 10, FestivalType.DIWALI);
		System.out.println(fixedDeposit.calcSimpleInterest());
	}

}
