public class LoopPractice {
    public static void main(String[] args) {
      // 1~ 100 합
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += (i + 1);
        }
        System.out.println(sum);

      // 5초부터 카운트 다운
      int count = 5;
      for (int i = 0; i <= 5; i++) {
          System.out.println(count);
          count -= 1;
      }

      // 30 반복 돌려서 홀수, 짝수 구분 지어서 합
      int odd = 0;
      int even = 0;
      int i = 0;
      while (i < 30) {
          int num = i + 1;
          if (num % 2 == 0) {
              even += num;
          } else {
              odd += num;
          }
          i++;
      }
      System.out.println("홀수 " + odd);
      System.out.println("짝수 " + even);


    }
}
