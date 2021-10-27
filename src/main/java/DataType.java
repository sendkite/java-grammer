import java.util.Arrays;

public class DataType {
    public static void main(String[] args) {
        // 참조 자료형 : 기본 자료형이 아닌 모든 것
        // 자바의 인스턴스 : 객체를 가르킬 수 있는 자료형
        // 클래스를 이용한 자료형
        String sparta = "Hello sparta";
        System.out.println(sparta);
        // 배열 : 동일한 자료형을 연속된 공간에 저장하는 자료형
        // 값 초기화 후 선언
        int[] intArray = new int[] {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(intArray));
        // 빈 배열 선언 : 디폴트 값으로 0이 할당됨
        int[] intEmptyArray = new int[5];
        System.out.println(Arrays.toString(intEmptyArray));

        // 빈 문자열 선언 : 기본 값이 없다는 표현으로 null이 출력
        String[] stringEmptyArray = new String[5];
        System.out.println(Arrays.toString(stringEmptyArray));

        // 문자열 배열 선언
        String[] season = {"봄", "여름", "가을", "겨울"};
        System.out.println(Arrays.toString(season));
        System.out.println(season[season.length - 1]);
    }
}
