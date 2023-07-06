package ch11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class S01 {
    public static void main(String[] args) {
        // 순서 o, 데이터중복 가능
        List list = new ArrayList<>();
        // 순서 x, 데이터 중복이 불가능
        // key만으로 이루어짐
        HashSet set = new HashSet<>();
        // 순서 x, key, value로 이루어짐
        // key 중복 불가,value 중복가능
        Map map = new HashMap<>();
        // 나중에 들어온 값이 먼저 나감
        Stack stack = new Stack<>();
        // 먼저 들어온 값이 먼저 나감
        Queue queue = new LinkedList<>();
    }
}
