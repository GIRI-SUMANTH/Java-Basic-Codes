public class Lab1_1 {
    public static void main(String[] args) {
        for (byte i = 0; i < 6; i++) {
            for (byte j = 0; j < 28; j++) {
                if ((j == 0 && i == 3) || (j == 1 && i == 4) || (j == 2 && i == 4) || (j == 3 && (i <= 3 && i >= 1))) {
                    System.out.print("J");
                } else if ((j >= 5 && j <= 11)) {
                    if ((i + j == 9) && (j <= 8)) {
                        System.out.print("A");
                    } else if ((j - i == 7) && (j >= 9)) {
                        System.out.print("A");
                    } else if ((j >= 6 && j <= 10) && (i == 3)) {
                        System.out.print("A");
                    } else {
                        System.out.print(" ");
                    }
                } else if ((j >= 13 && j <= 19) && ((j <= 16 && j - i == 12) || (j >= 16 && j + i == 20))) {
                    System.out.print("V");
                } else if ((j >= 21 && j <= 27)) {
                    if ((i + j == 25) && (j <= 24)) {
                        System.out.print("A");
                    } else if ((j - i == 23) && (j >= 25)) {
                        System.out.print("A");
                    } else if ((j >= 22 && j <= 26) && (i == 3)) {
                        System.out.print("A");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print(" ");
                }

            }
            System.out.print("\n");

        }
    }
}
