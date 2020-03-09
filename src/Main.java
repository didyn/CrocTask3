public class Main {
    public static void main(String[] args) {
        ChessPosition position = new ChessPosition(3, 6);
        position.setX(7);
        System.out.println(position.toString());
        System.out.println(checkWay(new ChessPosition[]{new ChessPosition(6, 7), new ChessPosition(7,5),
                new ChessPosition(5, 3), new ChessPosition(4, 2), new ChessPosition(2, 1)}));

    }

    public static String checkWay(ChessPosition[] array){
        for (int i = 0; i < array.length - 1; i++){
            try {
                if ((Math.abs(array[i].getX() - array[i + 1].getX()) != 2 ||
                        Math.abs(array[i].getY() - array[i + 1].getY()) != 1) &&
                        (Math.abs(array[i].getX() - array[i + 1].getX()) != 1 ||
                                Math.abs(array[i].getY() - array[i + 1].getY()) != 2))
                    throw new  IllegalMoveException("Wrong way", array[i], array[i + 1]);
            }
            catch (IllegalMoveException e){
                return "конь так не ходит: " + e.getFrom().toString() + " -> " + e.getTo().toString();
            }
        }
        return "ok";
    }
}
