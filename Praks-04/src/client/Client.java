package client;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Optional;

import card.CreditCard;
import card.DebitCard;

public class Client {
    protected long idCode;
    protected CreditCard creditCard;
    protected DebitCard debitCard;
    protected LocalDate dateOfBirth;
    protected BigDecimal monthlyFee = BigDecimal.ONE;

    public Client(long idCode, LocalDate dateOfBirth) {
        this.idCode = idCode;
        this.setDateOfBirth(dateOfBirth);
    }

    public BigDecimal getMonthlyFee() {
        return monthlyFee;
    }

    public void addDebitCard(DebitCard card) {
        this.debitCard = card;
    }

    public void addCreditCard(CreditCard card) {
        this.creditCard = card;
    }

    public DebitCard getDebitCard() {
        return debitCard;
    }

    public CreditCard getNullableCreditCard() {
        return creditCard;
    }

    public Optional<CreditCard> getCreditCard() {
        return Optional.ofNullable(creditCard);
    }

    @Override
    public String toString() {
        return "Client [idCode=" + idCode + ", creditCard=" + creditCard
                + ", debitCard=" + debitCard + ", dateOfBirth=" + dateOfBirth
                + "]";
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

}
