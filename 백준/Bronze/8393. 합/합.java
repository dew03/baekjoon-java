import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n < 1 || n > 10000) return;         // 입력 검증 코드
        int sum = 0;

        // 문제 풀이 로직
        for (int i = 0; i < n; i++) {
            sum = sum + (i + 1);
        }
        System.out.print(sum);
    }
}
