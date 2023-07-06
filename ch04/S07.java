package ch04;

public class S07 {
    public static void main(String[] args) {
        // 터미널에서 ctrl+c 강제종료 가능
        int i=1;
        while(true){
            if (i>1000) {
                //while 문 내부에서 반복 멈출 때 사용
                System.out.println("반복을 멈춤 : "+i);
                break;
            }
            System.out.println(i);
            i++;
        }

    }
}
