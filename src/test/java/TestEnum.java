import org.jcmc.test.enums.Dia;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestEnum {

    @DisplayName("Validando Enums")
    @Test
    public void validarEnum() {
        Dia lunes = Dia.LUNES;
        Assertions.assertEquals(lunes.getDia(), "Lunes");

    }
}
