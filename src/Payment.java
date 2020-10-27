//E1700879
public class Payment {
	private double Amount;
	
	public Payment() {
		Amount=0;
	}
	
	public Payment(double amut) {
		Amount = amut;
	}
	
	public double getAmount() {
		return Amount;
	}
	
	public void setAmount(double amut) {
		Amount = amut;
	}
	
	public String toString() {
		return "Amount paid is= " +Amount; 
	}
}
