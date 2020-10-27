//E1700879
public class CashPayment extends Payment{
	public CashPayment(double amut) {
		super(amut);
	}
	
	public String toString() {
		return "Amountpaid wiht cash is= "+super.getAmount();
	}
}
