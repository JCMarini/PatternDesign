import org.jcmc.test.decorator.Automovil;
import org.jcmc.test.decorator.AutoEstandar;
import org.jcmc.test.decorator.AutoElectrico;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestDecorator {

    @DisplayName("Validando el decorador")
    @Test
    public void ValidarDecorador(){
        Automovil camioneta = new AutoEstandar();
        camioneta.encender();
        camioneta.acelerar();
        camioneta.frenar();
        camioneta.apagar();

        AutoElectrico tesla = new AutoElectrico(camioneta);
        tesla.setEnchufar(true);

        Assertions.assertTrue(tesla.isEnchufar());
    }
}

