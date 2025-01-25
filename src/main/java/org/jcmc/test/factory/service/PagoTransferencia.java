package org.jcmc.test.factory.service;

public class PagoTransferencia implements PagoInterface {

    @Override
    public void generarPago() {
        System.out.println("Generar el pago de Transferencia");
    }
}
