package org.jcmc.test.singleton.model;

public class Usuario {
    private Version version = Version.getInstance();

    public String getVesion() {
        return version.toString();
    }

}
