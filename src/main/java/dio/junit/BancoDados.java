package dio.junit;

import java.util.logging.Logger;


public class BancoDados {

    private static final Logger logger = Logger.getLogger(BancoDados.class.getName());

    public static void iniciarConexao(){
        logger.info("Iniciou conexao");

    }

    public static void finalizarConexao(){
        logger.info("Finalizou conexao");
    }

    public static void insereDados(Pessoa pessoa){
        //insere pessoa no BD
        logger.info("Inseriu Dados");
    }

    public static void removeDados(Pessoa pessoa){
        //remove  pessoa no BD
        logger.info("Removeu Dados");
    }
}
