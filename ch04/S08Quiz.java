package ch04;

public class S08Quiz {
    public static void main(String[] args) {
        int i = 1000;
        while (i > 0) {
            if (i < 101)
                break;
            if (i % 5 != 0)
                System.out.println(i);
            i--;
        }
    }
}
