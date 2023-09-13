package exercício5;

public class ClienteNaoExisteException extends Exception{

    public ClienteNaoExisteException (String msg){
        super(msg);
    }
}
