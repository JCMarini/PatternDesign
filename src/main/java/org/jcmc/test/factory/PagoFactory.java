package org.jcmc.test.factory.service;

import org.jcmc.test.factory.model.TipoPago;

import java.util.HashMap;
import java.util.Map;

public class PagoFactory {

    // se generan los tipos de pago en un Map para acceder por la llave tipo de pago
    private final static Map<TipoPago, PagoInterface> pagos = new HashMap<>() {{
        put(TipoPago.PAYPAL, new PagoPaypal());
        put(TipoPago.EFECTIVO, new PagoEfectivo());
        put(TipoPago.TRANSFERENCIA, new PagoTransferencia());

    }};

    public PagoInterface obtenerPago(TipoPago tipoPago) {
        return pagos.get(tipoPago);
    }
}
