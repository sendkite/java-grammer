public class Operator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        // 관계 연산자 =< => > < != ==

        // 논리 연산자 && || !bool

        // 비트 연산자

        // 대입 연산자
        num1 += num2;
        System.out.println(num1);

        num1 -= num2;
        System.out.println(num1);

        num1 *= num2;
        System.out.println(num1);

        num1 /= num2;
        System.out.println(num1);

        num1 %= num2;
        System.out.println(num1);

        // condition

        // switch 문, if 문
        // 3항 조건문
        int a = 5;
        String result = (a < 10) ? "10보다 작습니다" : "10보다 큽니다";
        System.out.println(result);
    }
}
