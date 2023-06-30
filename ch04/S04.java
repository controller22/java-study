package ch04;

public class S04 {
    public static void main(String[] args) {
        // Math.ranom()
        // 0보다 크거나 같고 1보다 작다
        // 45를 곱하면 0-44.9999.... 까지 나옴
        int num=(int)(Math.random()*45+1);
        
        System.out.println(num);
    }
}
