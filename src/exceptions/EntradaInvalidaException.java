package exceptions;

// Adicionamos o 'extends Exception' para que ela seja uma exceção válida
public class EntradaInvalidaException extends Exception {

    // Construtor que recebe a mensagem de erro
    public EntradaInvalidaException(String mensagem) {
        super(mensagem);
    }
}
