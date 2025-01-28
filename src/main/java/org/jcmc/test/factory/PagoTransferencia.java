package org.jcmc.test.factory;

public class PagoTransferencia implements PagoInterface {

    @Override
    public String generarPago() {
        return TipoPago.TRANSFERENCIA.toString();
    }
}
