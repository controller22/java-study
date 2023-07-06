package ch02;

import java.text.MessageFormat;

public class S02 {
    public static void main(String[] args) {

        // String str="저는 홍길동이고 25세입니다";

        String name = "g-dragon";
        int age = 34;

        //문자열 사이에 변수를 넣고싶은 경우 문자열을 더함
        //보기애 깔끔하지 않고 사용하기 불편
        String str1 = "저는 " + name + "이고 " + age + "세입니다\n";
        System.out.printf(str1);

        //특수문자를 넣는경우 \을 넣어줘야함
        //형식화된 출력(printf)
        System.out.printf("\"저는 %s이고 %d세입니다\"\n","고양이",2);
        
        //문자열
        //소수점 단위 제한가능
        System.out.printf("%.2f\n", 10.0/3);

        //잘린 소수점 0.5이상 자동 반올림
        System.out.printf("%.2f\n", 3.6666666666666);
    
        // 문자열 포맷팅 / 문자열 보관법
        String str2= String.format("저는 %s\n", "홍길동");
        System.out.println(str2);

        String str3 = MessageFormat.format("저는 {0} {1} {0}\n", "다나카",30);
        System.out.println(str3);
    }
}
