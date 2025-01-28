package org.jcmc.test.factory;

public enum TipoPago {
    PAYPAL("PAYPAL"),
    EFECTIVO("EFECTIVO"),
    TRANSFERENCIA("TRANSFERENCIA");

    private final String descripcion;

    // Constructor del enum
    TipoPago(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return descripcion;
    }


}
