package dio.junit;


public class TrasferenciaEntreContas {

    public void transfere(Conta contaOrigem, Conta ContaDestino, int valor){
        if(valor <= 0){
            throw new IllegalArgumentException("Valor deve ser maior que zero");
        }

    }
}
