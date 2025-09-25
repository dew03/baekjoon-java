import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String bStr = Integer.toString(b);
        System.out.println(a * (bStr.charAt(2)-'0'));
        System.out.println(a * (bStr.charAt(1)-'0'));
        System.out.println(a * (bStr.charAt(0)-'0'));
        System.out.println(a*b);
    }
}