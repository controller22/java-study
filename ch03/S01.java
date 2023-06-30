package ch03;

public class S01 {
    public static void main(String[] args) {
        
        int num=10;

        //증감연산자
        //앞에 있으면 계산이 다 끝난 다음에
        //값에 대입
        System.out.println(++num);
        System.out.println(num);

        int num1=20;

        //증감 연산자가 뒤에 있으면
        //대입 이후 계산이 시작
        System.out.println(num1++);
        System.out.println(num1);

        int num2=30;
        int num3=num2++;

        System.out.println(num3);
        
        
    }
}
