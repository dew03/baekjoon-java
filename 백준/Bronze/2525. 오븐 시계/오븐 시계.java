import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();
        int T = sc.nextInt();

        // 입력 검증 코드
        if (H < 0 || H > 23) {              // H이 0보다 작거나 23보다 클 경우
            return;
        } else if (M < 0 || M > 59) {       // M이 0보다 작거나 59보다 클 경우
            return;
        }

        // 문제 풀이 로직
        int result = M + T;
        if (result >= 60) {                 // result의 값이 60 이상일 때
            int temp = result / 60;         // 시간에 더해줄 값
            result = result % 60;           // 분은 0~59로 다시 맞춤
            H = H + temp;
            if (H >= 24) {                  // 24시를 넘어가면 0시부터 다시 시작
                H = H % 24;
            }
            System.out.print(H + " " + result);
        } else {                            // result의 값이 60 미만일 때
            System.out.print(H + " " + result);
        }
    }
}
