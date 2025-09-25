import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int[] result = new int[t];          // 정답을 넣기 위한 배열 생성

        // 문제 풀이 로직
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a < 0 || b > 10) return;    // 입력 검증 코드
            result[i] = a + b;
        }

        // 출력 반복문
        for (int i = 0; i < t; i++) {
            System.out.println(result[i]);
        }
    }
}
