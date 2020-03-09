public class IllegalMoveException extends Exception {
    private ChessPosition from;
    private ChessPosition to;

    IllegalMoveException(String message, ChessPosition from, ChessPosition to){
        super(message);
        this.from = from;
        this.to = to;
    }

    public ChessPosition getFrom() {
        return from;
    }

    public ChessPosition getTo() {
        return to;
    }
}
