package ch11;

import java.util.LinkedList;
import java.util.Queue;

//선입선출 -응식점, 은행 번호표 등의 시스템
public class S06 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();

        queue.add("사과");
        queue.add("바나나");
        queue.add("멜론");

        System.out.println(queue);

        queue.poll();

        System.out.println(queue);

    }
}
