package ch12;

//제네릭
class Num<T extends Number> {
    // 필드가 정수일수도 실수 일수도 있을 경우
    T value;

    public Num(T value) {
        this.value = value;
    }

}

public class S01 {
    public static void main(String[] args) {

        Num<Long> num = new Num<Long>(1L);

    }
}
