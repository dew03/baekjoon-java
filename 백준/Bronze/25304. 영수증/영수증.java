import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int price = sc.nextInt();   // 총 금액
        int n = sc.nextInt();       // 물건의 종류 개수
        int mul = 0;
        int sum = 0;

        for(int i=0; i<n; i++) {    // 종류 개수만큼 반복
            int a = sc.nextInt();   // 각 물건의 가격
            int b = sc.nextInt();   // 각 물건의 개수
            mul = a*b;
            sum += mul;
        }
        if(sum == price){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}