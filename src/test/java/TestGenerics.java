import org.jcmc.test.generics.GenericClass;
import org.jcmc.test.generics.GenericMethod;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestGenerics {

    @DisplayName("Validando objetos genericos")
    @Test
    public void ValidarGenerics() {

        // validando una clase generica
        GenericClass type = new GenericClass<>(0.12);
        Assertions.assertEquals(type.getGenericType(), "java.lang.Double");

        // validando el resultado de un metodo generico
        GenericMethod typeMethod = new GenericMethod();
        Assertions.assertEquals(typeMethod.getTypeMethod(1.0), "java.lang.Double");

        // validacion con listas genericas
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        Assertions.assertNotEquals(Collections.EMPTY_LIST,
                typeMethod.getList(lista));

        List<Boolean> lista2 = new ArrayList<>();
        lista2.add(false);
        lista2.add(true);

        Assertions.assertEquals(Collections.EMPTY_LIST,
                typeMethod.getList(lista2));
    }
}
