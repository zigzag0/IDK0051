package card;

import java.math.BigDecimal;

public class DebitCard implements Card {

    private BigDecimal balance;

    public DebitCard() {
        this.balance = new BigDecimal("10000.05");
    }

    @Override
    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void depositMoney(BigDecimal amount) {
        setBalance(getBalance().add(amount));
        // balance = balance.add(amount);

    }

    @Override
    public void makePayment(BigDecimal amount) {
        System.out.println("Deebetkaardi makse");
        // balance = balance.subtract(amount);
        makePaymentCore(amount);
    }

    void makePaymentCore(BigDecimal amount) {
        balance = balance.subtract(amount);
    }

}
