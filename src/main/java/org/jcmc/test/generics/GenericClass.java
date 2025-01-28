package org.jcmc.test.generics;

public class Generic<T> {

    private final T genericType;

    public Generic(T tipo) {
        this.genericType = tipo;
    }

    public String getGenericType() {
        return genericType.getClass().getName();
    }
}
