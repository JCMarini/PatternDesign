import org.jcmc.test.builder.UsuarioDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestBuilder {

    @DisplayName("Validando clase UsuarioDTO Builder")
    @Test
    public void testBuilder() {
        UsuarioDTO usuario = new UsuarioDTO.Builder()
                .setFirstName("Juan Carlos")
                .build();

        Assertions.assertNotNull(usuario.firstName);
    }
}
