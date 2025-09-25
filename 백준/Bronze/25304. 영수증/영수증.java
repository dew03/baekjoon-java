import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();   // 총 금액
        int N = sc.nextInt();   // 물건 종류
        int sum = 0;            // 곱한 값을 더해 저장할 변수

        // 입력 검증 코드
        if (X < 1 || X > 1000000000) return;
        if (N < 1 || N > 100) return;

        // 문제 풀이 로직
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum = (a * b) + sum;
        }
        if (X == sum) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
        sc.close();
    }
}
