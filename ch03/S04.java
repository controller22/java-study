package ch03;

public class S04 {
    public static void main(String[] args) {
        //System.out.println(3>2);

        //boolean check = 100>=100;
        
        boolean check1 = true&&true;
        System.out.println(check1);
        
        boolean check2 = true&&false;
        System.out.println(check2);
        
        boolean check3 = true||false;
        System.out.println(check3);

        //boolean은 계산이 false가 나올 때까지
        //로직을 짤 때 and 조건 사용시 false가 자주 나오는 조건을 앞에 건다 
        boolean check4 = true&&true&&true&&true&&true&&true&&true&&true&&false;

        //or 조건시 true가 자주 나오는  조건을 앞에 건다.
        boolean check6 = false || false|| false || false || true;
        System.out.println(check3);
    }
}
