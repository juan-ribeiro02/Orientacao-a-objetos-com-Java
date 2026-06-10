package exercicioPratico.ex4.dominio;

public class PlacaInvalidaException extends RuntimeException{
    public PlacaInvalidaException(String mensagem){
        super(mensagem);
    }
}
