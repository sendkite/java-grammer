public class Loop {
    public static void main(String[] args) {
        // for
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += (i + 1);
        }
        System.out.println(sum);

        // forEach
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for (String day : days) {
            System.out.println(day);
        }

        // while
        int i = 0;
        int sum2 = 0;
        while (i < 10) {
            if (i == 4) {
                i++;
                // 이 경우는 그냥 지나가줘
                continue;
            }
            sum2 += (i + 1);
            i++;
            if (i == 10) {
                // 이 경우 멈춰!
                break;
            }
        }
        System.out.println(sum2);

        // do while
        int j = 0;
        int sum3 = 0;

        do {
            sum3 += (j + 1);
            j++;
        } while (j < 10);
        System.out.println(sum3);
    }
}
