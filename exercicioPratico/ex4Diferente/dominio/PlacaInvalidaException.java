package exercicioPratico.ex4Diferente.dominio;

public class PlacaInvalidaException extends RuntimeException{
    public PlacaInvalidaException(String mensagem){
        super(mensagem);
    }
}
