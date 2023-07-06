package ch04;

public class S10 {
    public static void main(String[] args) {
        int sum=0;

        for (int i = 0; i < 101; i+=2) {
            System.out.print(i+" ");
            sum+=i;    
            if (i>=100) {
                System.out.println();
            }
        }

        System.out.println( "1-100의 짝수의 합 : " + sum);

    }
}
