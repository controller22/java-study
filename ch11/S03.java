package ch11;

import java.util.HashSet;
import java.util.Set;

public class S03 {
    public static void main(String[] args) {

        Set<String> set = new HashSet<String>();

        set.add("바나나");
        set.add("사과");
        set.add("바나나");
        set.add("망고");
        set.add("멜론");
        set.add("딸기");

        System.out.println(set);
        // set은 순서x 번호로 값 못 가져옴
        // set.get();

        // set은 리스안에 값이 있는지 없는지 파악 시 사용
        System.out.println(set.contains("파인애플"));
    }
}
