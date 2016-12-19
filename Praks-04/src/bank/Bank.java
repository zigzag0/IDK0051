package bank;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import card.Card;
import card.CreditCard;
import client.Client;
import client.SeniorClient;

public class Bank {

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        List<Optional<Client>> clients = Arrays.asList(
                BankClientGateway.getClientById(1,
                        LocalDate.parse("2015-01-12", formatter)),
                BankClientGateway.getClientById(2,
                        LocalDate.parse("2009-02-22", formatter)),
                BankClientGateway.getClientById(12,
                        LocalDate.parse("2005-01-12", formatter)),
                BankClientGateway.getClientById(99,
                        LocalDate.parse("2005-01-12", formatter)),
                BankClientGateway.getClientById(100,
                        LocalDate.parse("2005-01-12", formatter)));

        for (Optional<Client> client : clients) {
            // deebetkaart alati olemas
            if (client.isPresent()) {
                System.out.println(client);
                client.get().getDebitCard().makePayment(BigDecimal.ONE);

                Card creditCard = client.get().getNullableCreditCard();
                if (creditCard != null) {
                    creditCard.makePayment(BigDecimal.TEN);
                }

                Optional<CreditCard> creditCardOpt = client.get()
                        .getCreditCard();
                if (creditCardOpt.isPresent()) {
                    creditCardOpt.get().makePayment(BigDecimal.TEN);
                }
            }
        }

        SeniorClient senior1 = new SeniorClient(500, LocalDate.parse(
                "1941-01-12", formatter));
        System.out.println("monthly fee: " + senior1.getMonthlyFee());

    }
}
