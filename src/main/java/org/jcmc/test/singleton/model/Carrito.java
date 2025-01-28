package org.jcmc.test.singleton.model;

public class Carrito {
    private Version version = Version.getInstance();

    public String getVesion() {
        return version.toString();
    }

}
