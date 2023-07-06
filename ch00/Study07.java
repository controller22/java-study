// package ch00;

// import lombok.AllArgsConstructor;
// import lombok.Data;
// import lombok.NoArgsConstructor;
// import lombok.ToString;

// // 롬복 라이브러리

// // 어노테이션을 읽어서 생성자를 만듦
// @AllArgsConstructor
// @NoArgsConstructor
// // getNmae,setNmae 등 필드의 데이터를 읽거나 수정하는 메소드를 자동으로 만듦
// @Data
// // 인스턴스의 정보를 정리해서 보여주도록 toString을 오버라이딩 함
// @ToString
// class Cat {
// private String name;
// private Boolean male;

// // lombnok 사용중에도 변경하고 싶은 메소드만 작성하면
// // 나머진는 기본적으로 작성 되고
// // 직접 작성한 것은 덮어씌워진다.
// public String getName() {
// return this.name + "입니다.";
// }
// }

// public class Study07 {
// public static void main(String[] args) {
// // 고양이 태어남
// Cat cat = new Cat("야옹이", true);

// // 고양이야 이름이 뭐야?
// System.out.println(cat.getName());

// // 고양이야 수컷이야?
// System.out.println(cat.getMale());

// // 이름 야옹이로 바꿔
// cat.setName("냐옹이");

// // 너에 대해서 알려줘
// // cat 또는 cat.toString
// System.out.println(cat.toString());
// }
// }
