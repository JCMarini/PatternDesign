import org.jcmc.test.factory.model.TipoPago;
import org.jcmc.test.factory.service.PagoFactory;
import org.jcmc.test.factory.service.PagoInterface;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TestFactory {

    @DisplayName("Validación factory ")
    @Test
    public void testFactory() {
        PagoFactory pagoFactory = new PagoFactory();
        PagoInterface pago = pagoFactory.obtenerPago(TipoPago.PAYPAL);
        pago.generarPago();

        Assertions.assertEquals(pago.generarPago(), TipoPago.PAYPAL.toString());

        pago = pagoFactory.obtenerPago(TipoPago.EFECTIVO);
        pago.generarPago();

        Assertions.assertEquals(pago.generarPago(), TipoPago.EFECTIVO.toString());

        pago = pagoFactory.obtenerPago(TipoPago.TRANSFERENCIA);
        pago.generarPago();

        Assertions.assertEquals(pago.generarPago(), TipoPago.TRANSFERENCIA.toString());
    }
}
