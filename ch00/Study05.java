package ch00;

public class Study05 {
    public static void main(String[] args) {
        // scop(스코프)
        // 글로벌
        // 어디서든 접근 가능한 변수
        // 함수
        // 함수 내에서만 작동하고 벗어나면 없어지는 변수
        // 블록
        // 블록 내에서만 작동하고 벗어나면 없어지는 변수
        // if, for, while 등 중괄호로 감싸지는 영역
        // 자바 변수는 기본적으로 블록단위

        // int i=0;
        // while(i<10){
        // int a=1;

        // System.out.println(a);
        // i++;
        // }
        // System.out.println(i);

        // 블록 스코프 내에서 만든 변수는 블록을 빠져나오면 없어진다
        // if (true) {
        // int a=1;
        // }
        // System.out.println(a); //
        // 작동 x

        // for문에서 만든 변수는
        // 반복이 끝날 떄까지 살아있다.
        // 반복이 종료되면 없어진다;
        // for(int i=0;i<10;i++){

        // }
        // System.out.println(i);

        // while 사용시 같은 변수로 여러개의 while을 사용하려면
        // 새로운 while을 쓰기 전에 변수를 초기값으로 변경 해야함
        // int i=0;
        // while (i<10) {
        // System.out.println("첫번째 while");
        // i++;
        // }
        // i=0;
        // while (i<10) {
        // System.out.println("두번째 while");
        // i++;
        // }

        // for (int i = 0; i < 10; i++) {
        //     System.out.println("첫번째 for");
        // }
        // for (int i = 0; i < 10; i++) {
        //     System.out.println("두번째 for");
        // }

        //프로그램 작동 동안 사용할 변수라면 글로벌
        //while에서는 횟수가 정해진 반복문 사용시
        //외부에 변수 먼저 만들고 변수를 변경해서 사용
        //for에서는 소괄호 안에 변수를 만들고 변경하면서 사용
        
        //if,while,for 등의 블록에서 반복회차마다 새로 사용할 변수는
        //블록 안에서 만든 후 사용

        

    }
}
