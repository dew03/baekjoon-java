import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();

        if(h>=0 && h<=23 && m >=0 && m<=59) {
            if (m >= 45) {
                m = m - 45;
                // h는 그대로
            } else {
                m = 60 + (m - 45);
                h = h - 1;
                if (h < 0) {
                    h = 23;
                }
            }
            System.out.println(h + " " + m);
        }
    }
}