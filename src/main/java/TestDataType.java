import java.lang.reflect.Array;
import java.util.Arrays;

public class TestDataType {
    public static void main(String[] args) {
        char c = 's';
        int num = 10;

        System.out.println(c + "\n" + num);

        int[] intArray = new int[] {10, 20, 30};
        System.out.println(Arrays.toString(intArray));
        System.out.println(intArray[intArray.length - 1]);

    }
}

