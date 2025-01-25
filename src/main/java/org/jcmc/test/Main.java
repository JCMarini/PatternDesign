package org.jcmc.test;

import org.jcmc.test.factory.service.PagoFactory;
import org.jcmc.test.factory.service.PagoInterface;
import org.jcmc.test.factory.model.TipoPago;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        // Esta es una prueba usando el patron de diseño Factory generamos un pago y la correcta implementacion de la interface PagoInterface
        PagoFactory pagoFactory = new PagoFactory();
        PagoInterface pago = pagoFactory.obtenerPago(TipoPago.PAYPAL);
        System.out.println("Se genero el pago en " + pago.generarPago());

        pago = pagoFactory.obtenerPago(TipoPago.EFECTIVO);
        System.out.println("Se genero el pago en "+ pago.generarPago());

        pago = pagoFactory.obtenerPago(TipoPago.TRANSFERENCIA);
        System.out.println("Se genero el pago en "+ pago.generarPago());


        //

    }
}