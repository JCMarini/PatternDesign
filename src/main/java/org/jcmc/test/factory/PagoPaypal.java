package org.jcmc.test.factory;

public class PagoPaypal implements PagoInterface {

    @Override
    public String generarPago() {
       return  TipoPago.PAYPAL.toString();
    }
}
