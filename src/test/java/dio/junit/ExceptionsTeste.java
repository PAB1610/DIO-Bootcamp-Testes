package dio.junit;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**Testar quando acontecem exceções*/
public class ExceptionsTeste {

    @Test
    void validaCenariodeExcecaoNaTransferencia(){
        Conta contaOrigem = new Conta("123456", 0);
        Conta contaDestino = new Conta("45678", 100);

        TrasferenciaEntreContas transferencia = new TrasferenciaEntreContas();

        //metodo que espera que a exeção seja lançada
     /*   Assertions.assertThrows(IllegalArgumentException.class, () ->
                transferencia.transfere(contaOrigem, contaDestino, -1));*/


        //espera que a exceção não seja lançada
        Assertions.assertDoesNotThrow (() ->
                transferencia.transfere(contaOrigem, contaDestino, -1));

    }



}
