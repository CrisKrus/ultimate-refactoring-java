package moveResponsibility;

import java.math.BigDecimal;

public class Invoice {
    private BigDecimal grossAmount;
    private BigDecimal taxPercentage;
    public int numberOfItems;

    public Invoice(String amount, String tax){
        grossAmount = new BigDecimal(amount);
        taxPercentage = new BigDecimal(tax);
    }

    public String calculateNetAmount(){
        return grossAmount.subtract(
                grossAmount.multiply(
                        taxPercentage.divide(
                                new BigDecimal("100")
                        )))
                .toString();
    }
}
