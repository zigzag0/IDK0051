package card;

import java.math.BigDecimal;
import java.util.Calendar;

public class CreditCard extends DebitCard{
	
	public CreditCard() {
		super();
	}
	
	public CreditCard(BigDecimal initialAmount) {
		setBalance(initialAmount);
	}

	@Override
	public void makePayment(BigDecimal amount) {
		System.out.println("Krediitkaardi makse");
		makePaymentCore(amount);
	}
	
	// method overloading
	public BigDecimal getBalance(Calendar cal) {
		return super.getBalance();
	}
}







