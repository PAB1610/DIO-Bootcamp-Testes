package dio.junit;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Date;

//exemplo importacao completa da classe pra não precisar escrever o nome da classe todas as vezes que for chamar
//um metodo dela
/**import static org.junit.jupiter.api.Assertions.*;*/
public class AssertionsTeste {

    @Test
    void validarLancamentos(){
        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {10, 5, 2, 3, 10};


/**Sempre no modo de validacao é o esperado no primeiro argumento e o inserido no segundo*/
    //    Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento); //validação se Arrays são iguais, teste um por um
        Assertions.assertNotEquals(primeiroLancamento, segundoLancamento); //verificar se são diferentes mesmo
    }

    void validarSeObjetoEstaNulo(){
        Pessoa pessoa = null;
        Assertions.assertNull(pessoa); //verifica se objeto é nullo
        pessoa = new Pessoa("Luciano", LocalDateTime.now());

        Assertions.assertNotNull(pessoa); //verifica se objeto não é nullo
    }
    @Test

    void validarNumerosDeTiposDiferentes(){
        double valor = 5.0;
        double outroValor = 5.0;
        Assertions.assertEquals(valor, outroValor);//metodo assertEquals() é sobrecarregado

    }
}
