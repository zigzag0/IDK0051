package bank;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import card.CreditCard;
import card.DebitCard;
import client.Client;

public class BankClientGateway {

    static Map<Long, Client> clients = new HashMap<>();

    public static Optional<Client> getClientById(long idCode,
            LocalDate dateOfBirth) {
        if (dateOfBirth.plusYears(7).isBefore(LocalDate.now())) {
            if (!clients.containsKey(idCode)) {
                clients.put(idCode, createClient(idCode, dateOfBirth));
            }
        } else {
            System.out
                    .println("You are so fucking young, go fucking home baby");
        }
        // return clients.get(idCode);
        return Optional.ofNullable(clients.get(idCode));
    }

    private static Client createClient(long idCode, LocalDate dateOfBirth) {
        Client client = new Client(idCode, dateOfBirth);
        client.addDebitCard(new DebitCard());
        decideAndAddBonus(client);
        decideAndCreateCreditCard(idCode, client);
        return client;
    }

    private static void decideAndCreateCreditCard(long idCode, Client client) {
        if (idCode < 80) {
            client.addCreditCard(new CreditCard());
        }
    }

    private static void decideAndAddBonus(Client client) {
        if (clients.size() % 3 == 0) {
            DebitCard debitCard = client.getDebitCard();
            debitCard.depositMoney(new BigDecimal(100));
        }
    }

}
