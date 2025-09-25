import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dice1 = sc.nextInt();
        int dice2 = sc.nextInt();
        int dice3 = sc.nextInt();
        int result = 0;

        if(dice1 == dice2 && dice2 == dice3){
            System.out.println(10000 + dice1 * 1000);
        }else if(dice1 == dice2 || dice2 == dice3 || dice1 == dice3){
            if(dice1 == dice2){
                result = dice1;
            }else if(dice2 == dice3){
                result = dice2;
            }else{
                result = dice3;
            }
            System.out.println(1000 + result * 100);
        }else{
            // 세 개 모두 다를 때: 가장 큰 값 찾기
            result = dice1;
            if(dice2 > result){
                result = dice2;
            }
            if(dice3 > result){
                result = dice3;
            }
            System.out.println(result * 100);
        }
    }
}
