import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        // 입력 검증 코드
        if (x < -1000 || x > 1000 || x == 0) {
            return;
        } else if (y < -1000 || y > 1000 || y == 0) {
            return;
        }

        if (x > 0 && y > 0) {               // 둘 다 양수인 경우
            System.out.print("1");
        } else if (x < 0 && y > 0) {        // x가 음수, y가 양수인 경우
            System.out.print("2");
        } else if (x < 0 && y < 0) {        // 둘 다 음수인 경우
            System.out.print("3");
        } else {                            // x가 양수, y가 음수인 경우
            System.out.print("4");
        }
    }
}
