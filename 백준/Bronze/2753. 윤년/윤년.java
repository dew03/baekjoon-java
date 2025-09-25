import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        if (year <= 0  || year > 4000) {
            return; // 조건 검증 코드
        }

        // year가 4의 배수라면
        if (year % 4 == 0) {
            // (year가 4의 배수인 상태에서) 100의 배수가 아니거나 400의 배수라면
            if (year % 100 != 0 || year % 400 == 0) {
                System.out.print("1");
            } else {
                System.out.print("0");
            }
        } else {
            System.out.print("0");
        }
    }
}
