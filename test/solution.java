package test;

public class solution {
    
    public int solution(int num1, int num2) {
        double answer = (double)num1/num2* 1000;
        return (int)answer;
    }



    public static void main(String[] args) {
        System.out.println(new solution().solution(2,3));
        System.out.println(new solution().solution(10,5));
        System.out.println(new solution().solution(3,2));
    }
}
