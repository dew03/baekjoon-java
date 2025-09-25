import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 입력 검증 코드
        if (a < 1 || a > 7) return;
        if (b < 1 || b > 7) return;
        if (c < 1 || c > 7) return;

        // 문제 풀이 로직
        int result = 0;
        int max = 0;
        if (a == b && b == c) {                     // 3개의 눈이 모두 같을 경우
            result = 10000 + (a * 1000);
            System.out.print(result);
        } else if (a == b || b == c || a == c) {    // 2개의 눈이 같을 경우
            if (a == b) {                           // a와 b가 같을 경우
                max = a;
                result = 1000 + (max * 100);
                System.out.print(result);
            } else if (b == c) {                    // b와 c가 같을 경우
                max = b;
                result = 1000 + (max * 100);
                System.out.print(result);
            } else {                                // a와 c가 같을 경우
                max = a;
                result = 1000 + (max * 100);
                System.out.print(result);
            }
        } else {
            if (a < b && b > c) {                   // b가 가장 클 경우
                max = b;
                result = b * 100;
                System.out.print(result);
            } else if (b < c && a < c) {            // c가 제일 클 경우
                max = c;
                result = c * 100;
                System.out.print(result);
            } else {                                // a가 제일 클 경우
                max = a;
                result = a * 100;
                System.out.print(result);
            }
        }
    }
}
