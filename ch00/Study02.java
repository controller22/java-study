package ch00;
public class Study02 {
    // 한 프로그램 내에 여러 main함수를 가질 수 x
    public static void main(String[] args) {
        //변수
        //데이터를 자바 프로그램이 실행되는 동안 유지 시 사용

        //기본형 타입 변수 (예약어 첫글자가 소문자인 타입)
        
        //int는 정수형 데이터 저장시 사용
        //소수가 없는 숫자
        //+-21억까지 저장
        int num = 1;
        //long은 정수형 데이터 int보다 큰 수 저장 시 사용
        //l을 붙여도 되고 안붙여도 됨
        long longNum = 2L;
        
        //실수형 데이터(무조건 f를 붙여야함)
        float floatNum = 1.2f;
        //실수형 데이터 더 큰 것 
        double doubleNum = 1.2;

        //논리형 데이터
        boolean bool = true; // 또는 false

        //문자 데이터 (캐릭터의 줄임말)
        //홑 따옴표로 감싼다.
        char ch = 'a';

        //참조형 타입변수(에약어 첫글자가 대문자인 타입)

        //문자열 데이터
        //쌍 따옴표로 감싼다.
        String str="hello world";
    }
}
