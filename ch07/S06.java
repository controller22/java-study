package ch07;

// 다른 패키지의 클래스를 가져오는 경우
// import 사용
import ch07.sub.Sub01;

public class S06 {
    public static int first = 1;
    public int second = 2;

    public void printSecond() {
        System.out.println(second);
    }

    public static void main(String[] args) {
        Sub01 sub01 = new Sub01();
        System.out.println(sub01.getData());

        System.out.println(first);// S06.first와 동일
        // System.out.println(second);//가져올 수 없다

        // static이 아닌 필드는 인스턴스를 생성해서 가져와야 한다.
        S06 s06 = new S06();
        System.out.println(s06.second);
        s06.printSecond();
    }
}
