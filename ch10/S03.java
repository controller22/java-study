package ch10;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class S03 {
    public static void main(String[] args) {
        // 현재시간을 가져온다
        LocalDateTime now = LocalDateTime.now();

        System.out.println(now);
        // plus minus / 예약 같은 기능 만들 때 사용
        LocalDateTime plusDays = now.plusDays(2);

        System.out.println(plusDays);

        // parse -> 다른 타입의 데이터나 가공되지 않은 데이터를 사용할 데이터로 바꾸는 작업
        LocalDateTime parse = LocalDateTime.parse("2023-07-08T14:25:25.099");

        System.out.println(parse);

        DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초");
        LocalDateTime parse2 = LocalDateTime.parse("1998년 01월 30일 00시 00분 00초", ofPattern);
        System.out.println(parse2);

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
    }
}
