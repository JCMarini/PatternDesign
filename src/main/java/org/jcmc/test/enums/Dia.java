package org.jcmc.test.enums;

public enum Dia {
    LUNES("Lunes"),
    MARTES("Martes"),
    MIERCOLES("Miercoles"),
    JUEVES("Jueves"),
    SABADO("Sabado"),
    DOMINGO("Domingo");

    String dia;

    Dia(String dia) {
        this.dia = dia;
    }

    public String getDia() {
        return dia;
    }
}