package dio.junit;

import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

public class ConsultarDadosPessoaTeste {
/**BeforeAll e AfterAll é uma execução única no unicio e no fim do ciclo do teste*/
/**BeforeEach e AfterEach executa antes e depois de cada teste que existir na classe*/
    @BeforeAll
    static void configuraConexao(){
        BancoDados.iniciarConexao();
    }
    @BeforeEach
    void insereDadosTeste(){
        BancoDados.insereDados(new Pessoa("Jose", LocalDateTime.of(2000, 1, 1, 13,0,0)));
    }
    @AfterEach
    void removeDadosTeste(){
        BancoDados.removeDados(new Pessoa("Jose", LocalDateTime.of(2000, 1, 1, 13,0,0)));
    }
    @Test
    void validarDadosRetorno(){
        Assertions.assertTrue(true);
    }
    @Test
    void validarDadosRetorno2(){
        Assertions.assertNull(null);
    }
    @AfterAll
    static void finalizarConexao(){
        BancoDados.finalizarConexao();
    }

}
