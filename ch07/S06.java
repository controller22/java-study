package ch07;

import ch07.sub.Sub01;

public class S06 {
    public static int first = 1;
    public int second = 2;
    public static final int third = 3;

    public void printSecond() {
        System.out.println(second);
    }

    public static void main(String[] args) {
        Sub01 sub01 = new Sub01();
        System.out.println(sub01.getData());

        System.out.println(first);// S06.first와 동일
        // System.out.println(second);//가져올 수 없다
        // System.out.println(printSecond());//실행 불가능

        // static이 아닌 필드는 인스턴스를 생성해서 가져와야 한다.
        S06 s06 = new S06();
        System.out.println(s06.second);
        s06.printSecond();

        S06.first = 11;
        // fianl 값은 변경 불가
        // S06.third=33;

        final String str = "홍길동";
        // str="임꺽정";

    }
}
