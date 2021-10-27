public class Main {
    public static void main(String[] args) {
        int number = 5;
        System.out.println(number);

        String sparta = "Hello sparta";
        System.out.println(sparta);

        final int finalNumber = 1;
        System.out.println(finalNumber);

//        기본 자료형 정리
//        정수형
//        2 byte
        short s = 1;
        System.out.println(s);
//        4 byte
        int a = 3;
        System.out.println(a);
//        8 byte
        long b = 4;
        System.out.println(b);
//        소수점
        float f = 5.5F;
        double d = 5.5;
        System.out.println(f);
        System.out.println(d);

        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Double.MIN_VALUE);

//        문자형
        char c = 'A';
        System.out.println(c);
        // 불리언
        boolean fact = true;
        fact = false;
        System.out.println(fact);

        // 바이트로 표현, 글짜의 경우 ASCII 코드로 표현됨
        byte data = 'd';
        System.out.println(data);

    }
}
