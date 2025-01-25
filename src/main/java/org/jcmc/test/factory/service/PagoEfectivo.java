package org.jcmc.test.factory.service;

public class PagoEfectivo implements PagoInterface {

    @Override
    public void generarPago() {
        System.out.println("Generamos el pago de Efectivo");
    }
}
