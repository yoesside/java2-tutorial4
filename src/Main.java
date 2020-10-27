//E1700879
public class Main {
	public static void main(String args[]) {
		Payment Hyuuga = new Payment(1000);
		System.out.println(Hyuuga.toString());
		//Manggil toString dari kelas Payment
		
		CashPayment Hyuuga1 = new CashPayment(1000);
		System.out.println(Hyuuga1.toString());
		//Manggil toString dari kelas CashPaymnet
		
		CreditCardPayment Hyuuga2 = new CreditCardPayment(1000, "Hyuuga T", "11/11/2020", "8040406");
		System.out.println(Hyuuga2.toString());
		//Manggil toString dari kelas CreditCardPayment
		
	}
}
