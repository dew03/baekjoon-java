import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=n; i<=9; i++){
            for(int j=1; j<10; j++){
                System.out.println(n + " * " + j + " = " + i*j);
            }
            break;
        }
    }
}
