package org.jcmc.test.singleton.model;

// tenemos que hacer que esta clase sea singleton para que se utilice
// desde las clases Usuario y Carrito
// para obtener una instancia de la clase version se debe hacer uso del metodo getInstance
// el cual regresara una unica clase la cual no podra cambiar a esto se le conoce
// como el patron de diseño de clase singleton
public class Version {

    private final int major;

    private final int minor;

    private final int revision;

    private static final Version instance = new Version();

    private Version() {
        this.major = 1;
        this.minor = 0;
        this.revision = 0;
    }

    public static Version getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return major + "." + minor + "." + revision;
    }
}
