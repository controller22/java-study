package ch04;

public class S08 {
    public static void main(String[] args) {
        // continue

        int i = 0;
        
        while (i < 1000) {
            i++;
            if (i % 2 == 1) {
                //continue를 사용한 위치에서 반복 중지
                //다음 반복으로 넘어감
                continue;//배치위치를 잘 지정해야함
            }
            System.out.println(i);
        }
    }
}
