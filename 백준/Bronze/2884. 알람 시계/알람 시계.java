import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        // 입력 검증 코드
        if (H < 0 || H > 23) {              // H이 0보다 작거나 23보다 클 경우
            return;
        } else if (M < 0 || M > 59) {       // M이 0보다 작거나 59보다 클 경우
            return;
        }

        // 문제 풀이 로직
        if (M >= 45) {                       // M이 45 이상일 경우
            System.out.print(H + " " + (M - 45));
        } else {                             // M이 45 미만일 경우
            int temp = 45 - M;
            if (H == 0) {                    // 자정일 경우
                System.out.print((H + 23)+ " " + (60-temp));
            } else {                         // 자정이 아닐 경우
                System.out.print((H - 1) + " " + (60-temp));
            }
        }
    }
}
