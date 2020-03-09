public class ChessPosition {
    private int x;
    private int y;

    ChessPosition(int x, int y) throws IllegalArgumentException {
        if (x >= 0 && x < 8 && y >= 0 && y < 8 ) {
            this.x = x;
            this.y = y;
        }
        else throw new IllegalArgumentException("Wrong position");
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) throws IllegalArgumentException{
        if (x >= 0 && x <= 8) {
            this.x = x;
        }
        else throw new IllegalArgumentException("Wrong x argument");
    }

    public void setY(int y) throws IllegalArgumentException{
        if (y >= 0 && y <= 8) {
            this.y = y;
        }
        else throw new IllegalArgumentException("Wrong y argument");
    }

    @Override
    public String toString(){
         char[] arrayX = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
         return String.valueOf(arrayX[x]) + (y + 1);
    }


}
