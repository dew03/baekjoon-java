import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        // 입력 검증 코드
        if (N < 1 || N > 9) return;

        // 문제 풀이 로직
        for (int i = 1; i <= 9; i++) {
            int result = N * i;
            System.out.println(N + " * " + i + " = " + result);
        }
    }
}
