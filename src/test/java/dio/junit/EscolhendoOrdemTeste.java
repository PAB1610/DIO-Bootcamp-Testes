package dio.junit;
import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.DisplayName.class) //ordem por anotação
public class EscolhendoOrdemTeste {

    @DisplayName("Valida Usuario foi criado")
    @Test
    void validaFluxoA(){
        Assertions.assertTrue(true);
    }
    @DisplayName("D")
    @Test
    void validaFluxoB(){
        Assertions.assertTrue(true);
    }
    @DisplayName("C")
    @Test
    void validaFluxoC(){
        Assertions.assertTrue(true);
    }
    @DisplayName("B")
    @Test
    void validaFluxoD(){
        Assertions.assertTrue(true);
    }
}
