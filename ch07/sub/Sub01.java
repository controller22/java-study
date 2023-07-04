package ch07.sub;

public class Sub01 {

    private String data = "데이터";

    // 객체지향에서 데이터는 객체마 볼 수 있는게 기본적
    public String getData() {

        // 객체의 데이터를 외부에 노출시키는 것은
        // 보통 메서드라 함
        // 원본 데이터 넘기기 가능
        // 숨겨야 하는 부분 숨기기 가능
        return "숨긴 " + data;
    }
}
