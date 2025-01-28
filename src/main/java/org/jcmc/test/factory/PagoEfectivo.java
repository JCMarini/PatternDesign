package org.jcmc.test.factory;

public class PagoEfectivo implements PagoInterface {

    @Override
    public String generarPago() {
       return TipoPago.EFECTIVO.toString();
    }
}
