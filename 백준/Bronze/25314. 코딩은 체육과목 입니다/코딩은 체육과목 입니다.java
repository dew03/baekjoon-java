import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int temp = 0;

        // 입력 검증 코드
        if (N < 4 && N % 4 != 0 || N > 1000 && N % 4 != 0) return;

        // 문제 풀이 로직
        for (int i = 0; i < N; i++) {
            temp++;
        }
        
        for (int i = 0; i < temp / 4; i++) {
            System.out.print("long ");
        }
        System.out.print("int");
        sc.close();
    }
}
