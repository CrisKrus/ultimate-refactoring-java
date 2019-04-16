package unit;

import moveResponsibility.Invoice;
import moveResponsibility.InvoiceService;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class InvoiceShould {

    @Test
    public void calculate_net_amount() throws Exception {
        InvoiceService invoiceService = new InvoiceService();

        String result = invoiceService
                        .calculateNetAmount("100", "10");

        assertThat(result).isEqualTo("90.0");
    }

    @Test
    public void calculate_net_amount_two() throws Exception {
        Invoice invoice = new Invoice("100", "10");

        String result = invoice.calculateNetAmount();

        assertThat(result).isEqualTo("90.0");
    }
}
