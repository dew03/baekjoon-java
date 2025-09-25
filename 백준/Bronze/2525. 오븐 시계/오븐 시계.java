import java.util.Scanner;
// 훈제오리구이를 시작하는 시각과 오븐구이를 하는 데 필요한 시간이 분단위로 주어졌을 때,
// 오븐구이가 끝나는 시각을 계산하는 프로그램을 작성하시오
// 14 30    17 40     23 48     입력 예시
// 20       80        25

// 14 50    19 0      0 13      출력 예시
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int time = sc.nextInt();
        b+=time; // b: 120

        int m = b/60; // b를 60으로 나눴을때의 몫 2
        a+=m;

        int v = b%60; // 나머지
        a = a % 24;
        System.out.printf("%d %d", a,v);
    }
}