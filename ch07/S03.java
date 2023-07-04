package ch07;

// public class S03 {
// public static void main(String[] args) {
// 초보자 초보자 = new 초보자();
// System.out.println("초보자 : " + 초보자.skill0);
// }
// }

// class Skill {
// String name;// 스킬 이름
// int damage;// 공격력

// public Skill(String name, int damage) {
// this.name = name;
// this.damage = damage;
// }
// }

// class Skill0 extends Skill {

// public Skill0() {
// super("달팽이 세마리", 1);
// }

// public Skill0(String name, int damage) {
// // 부모의 생성자를 호출
// // Skill은 name, damage 둘다 받아야 생성이 가능
// // 그러므로 부모 생성자를 호출해 값을 넣어줘야 함
// super(name, damage);
// }
// }

// // Skill1 클래스 생성(Skill 상속), 모든 매개변수를 받는 생성자 만들기
// class Skill1 extends Skill {

// public Skill1(String name, int damage) {
// super(name, damage);
// }
// }

// class 초보자 {
// Skill skill0;

// public 초보자() {
// this.skill0 = new Skill0();
// }

// public 초보자(Skill0 skill0) {
// this.skill0 = skill0;
// }
// }

// class 마법사 extends 초보자 {
// Skill skill1;

// public 마법사() {
// super(new Skill0("달팽이 세마리", 3));
// this.skill1 = new Skill1("메직클로", 10);
// }
// }