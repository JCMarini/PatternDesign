package org.jcmc.test.generics;

import java.util.LinkedList;
import java.util.List;

public class GenericMethod {

    public <T> String getTypeMethod(T type) {
        return type.getClass().getTypeName();
    }

    public List<?> getList(List<?> list) {
        List<Number> response = new LinkedList<>();
        for (Object number : list) {
            switch (number.getClass().getTypeName()) {
                case "java.lang.Integer":
                    response.add((Number) number);
                    break;
                case "java.lang.Boolean":
                default:
                    response.clear();
            }
        }
        return response;
    }
}
