package ch07;

public class S05 {
    public static void main(String[] args) {
        // 모든 클래스의 최상위 부모
        Object object = new Object();

        object.getClass();
        object.hashCode();
        object.toString();
        object.equals(null);
        // 등이 있음

        // 객체는 직접 사옥하지 않아도 Object를 상속 받음
        String str = "홍길동";

        object.getClass();
        object.hashCode();
        object.toString();
        object.equals("김첨지");

        Object str1 = new String("홍길동");
    }
}
