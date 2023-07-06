package ch00;
public class Study03 {
    public static void main(String[] args) {
        //문자는 더하면 합쳐진다
        //System.out.println("hello"+"world");

        //숫자는 더하면 연산된다
        // System.out.println(1+1);

        //문자와 숫자를 더하면 합쳐진다
        // System.out.println("hello"+1);

        //문자와 불린를 더하면 문자열로 합쳐진다
        // System.out.println("hello"+false);

        int num=2;
        double doubleNum=3;

        //정수와 실수의 연산은 실수
        System.out.println(num+doubleNum);
        System.out.println(doubleNum-num);
        System.out.println(doubleNum*num);
        System.out.println(doubleNum/num);

        //정수와 정수의 연산은 정수 => 소수점아래수는 버려짐
        System.out.println(3/2);
        //%는 몫을 연산
        System.out.println(3%2);
    }
}
