package ch.fanblade;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        for (int i = 0; i < 10; i++) {
            System.out.println();
        }

        for (int i = 0; i < Board.boardArray.length; i++) {

            for (int j = 0; j < Board.boardArray.length; j++) {
                if (i % Field.fieldsizeBSide == 0) {
                    System.out.print("-");
                } else if (j % Field.fieldsizeASide == 0) {
                    System.out.print("|");

                } else {
                    System.out.print("x");
                }

            }
            System.out.println();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println();
        }



    }
}