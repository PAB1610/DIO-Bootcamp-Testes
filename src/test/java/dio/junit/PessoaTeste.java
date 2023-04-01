package dio.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class PessoaTeste {


    /**Exemplo de como desenvolver um metodo padrão de teste*/
    @Test
    //testar se o calculo de idade está correto
    void deveCalcularIdadeCorretamente(){
        Pessoa jessica = new Pessoa("Jessica", LocalDateTime.of(2000,1,1,15,0,0));
        Assertions.assertEquals(23, jessica.getIdade()); // espero que seja 22 quando eu chamar getIdade

    }

    @Test
    void deveRetornarSeEhMaiorDeIdade(){
        Pessoa jessica = new Pessoa("Jessica", LocalDateTime.of(2000,1,1,15,0,0));
        Assertions.assertTrue(jessica.ehMaiorDeIdade());

        Pessoa joao = new Pessoa("Joao", LocalDateTime.of(2023,1,1,15,0,0));
        Assertions.assertFalse(joao.ehMaiorDeIdade());

        Pessoa pablo = new Pessoa("Pablo", LocalDateTime.of(2006,1,1,15,0,0));
        Assertions.assertFalse(pablo.ehMaiorDeIdade());
    }

}
