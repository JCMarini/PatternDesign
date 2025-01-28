package org.jcmc.test.generics;

public class GenericClass<T extends Number> {

    private final T genericType;

    public GenericClass(T tipo) {
        this.genericType = tipo;
    }

    public String getGenericType() {
        return genericType.getClass().getTypeName();
    }
}
