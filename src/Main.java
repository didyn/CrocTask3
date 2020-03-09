import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ChessPosition position = new ChessPosition(3, 6);
        position.setX(7);
        System.out.println(position.toString());
        System.out.println(checkWay(new String[]{"g8", "e7", "c8", "d6", "b5"}));
    }

    public static String checkWay(String[] array){
        for (int i = 0; i < array.length - 1; i++){
            try {
                if ((Math.abs(convert(array[i]).getX() - convert(array[i + 1]).getX()) != 2 ||
                        Math.abs(convert(array[i]).getY() - convert(array[i + 1]).getY()) != 1) &&
                        (Math.abs(convert(array[i]).getX() - convert(array[i + 1]).getX()) != 1 ||
                                Math.abs(convert(array[i]).getY() - convert(array[i + 1]).getY()) != 2))
                    throw new  IllegalMoveException("Wrong way", convert(array[i]), convert(array[i + 1]));
            }
            catch (IllegalMoveException e){
                return "конь так не ходит: " + e.getFrom().toString() + " -> " + e.getTo().toString();
            }
        }
        return "ok";
    }

    private static ChessPosition convert(String position){
        String letters = "abcdefgh";
        return new ChessPosition(letters.indexOf(position.toCharArray()[0]),
                Character.getNumericValue(position.toCharArray()[1]) - 1);
    }
}
