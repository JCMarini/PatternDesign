import org.jcmc.test.singleton.model.Carrito;
import org.jcmc.test.singleton.model.Usuario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestSingleton {

    // Aqui vamos a probar el patron singleton
    @DisplayName("Validación singleton ")
    @Test
    public void validateVersion() {
        Carrito car = new Carrito();
        Usuario user = new Usuario();
        Assertions.assertEquals(car.getVesion(), user.getVesion());
    }

}
