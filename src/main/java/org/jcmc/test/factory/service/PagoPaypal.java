package org.jcmc.test.factory.service;

public class PagoPaypal implements PagoInterface {

    @Override
    public void generarPago() {
        System.out.println("Generamos el pago de Paypal");
    }
}
