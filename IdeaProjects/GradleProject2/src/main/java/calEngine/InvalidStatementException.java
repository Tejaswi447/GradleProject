package calEngine;

public class InvalidStatementException extends ArrayIndexOutOfBoundsException{
    public InvalidStatementException(String message){
        super(message);
    }
}
