package ch02;

import java.util.Scanner;

public class S03 {
    public static void main(String[] args) {

        // 콘솔에 입력 받을 때 사용
        // 표준 입력장치인 키보드 등의 데이터를 받음
        Scanner scanner = new Scanner(System.in);

        // 스캐너에서 nextInt 사용하면
        // 입력된 값을 형변환해서 리턴
        // int nextInt = scanner.nextInt();

        // System.out.println("나온 값은 " + nextInt);
        
        // next는 띄어쓰기 기준으로 데이터를 나눠서 받음
        // String next = scanner.next();
        // String next1 = scanner.next();
        // String next2 = scanner.next();
        // System.out.println(next);
        // System.out.println(next1);
        // System.out.println(next2);

        // nextLine은 한 줄 기준으로 데이터를 가져옴
        String nextLine = scanner.nextLine();
        System.out.println(nextLine);
        
        scanner.close();
    }
}

