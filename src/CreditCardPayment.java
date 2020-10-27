//E1700879
public class CreditCardPayment extends Payment{
	private String Name;
	private String ExpireDate;
	private String Number;
	
	public CreditCardPayment() {
		Name="@";
		ExpireDate="@";
		Number="@";
	}
	public CreditCardPayment(double amut, String nam, String exre, String num) {
		super(amut);
		Name=nam;
		ExpireDate=exre;
		Number=num;
	}
	public void setName(String nam) {
		Name=nam;
	}
	public String getName() {
		return Name;
	}
	public void setExpireDate(String exre) {
		ExpireDate=exre;
	}
	public String getExpireDate() {
		return ExpireDate;
	}
	public void setNumber(String num) {
		Number=num;
	}
	public String getNumber() {
		return Number;
	}
	public String toString() {
		return "Payment wiht credit card information "+super.toString()+" Name ="+Name+" Number="+ Number;
	}
}
