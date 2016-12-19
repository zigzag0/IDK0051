package client;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

public class SeniorClient extends Client {

    public SeniorClient(long idCode, LocalDate dateOfBirth) {
        super(idCode, dateOfBirth);
        // TODO Auto-generated constructor stub
    }

    public BigDecimal getMonthlyFee() {
        Period period = dateOfBirth.until(LocalDate.now());
        int age = period.getYears();
        return monthlyFee.subtract(new BigDecimal(age).divide(new BigDecimal(
                "100")));
    }

}
