package ch04;

public class S14 {
    public static void main(String[] args) {

        // // 2
        // for (int i = 0; i < 5; i++) {
        // for (int j = 0; j < i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // 4
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 5; j > i*2; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
