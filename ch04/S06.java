package ch04;

public class S06 {
    public static void main(String[] args) {
        //보통 while 은 기준이 되는 외부의 변수가 필요        
        int i = 1;
        while (i<=100000) {
            System.out.println(i);
            //보통 기준이 되는 변수를 내부에서 조작해야 함
            i++;
        }
    }
}
