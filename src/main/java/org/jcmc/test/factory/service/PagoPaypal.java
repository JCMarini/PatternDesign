package org.jcmc.test.factory.service;

import org.jcmc.test.factory.model.TipoPago;

public class PagoPaypal implements PagoInterface {

    @Override
    public String generarPago() {
       return  TipoPago.PAYPAL.toString();
    }
}
