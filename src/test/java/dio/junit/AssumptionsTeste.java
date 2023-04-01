package dio.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

/**Premissa
 * Neste caso o teste só irá rodar se uma condição específica ocorrer*/
public class AssumptionsTeste {

    @Test
    void validarAlgoSomenteNoUsuarioWillian(){
        Assumptions.assumeTrue("root".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5+5);
    }

}
