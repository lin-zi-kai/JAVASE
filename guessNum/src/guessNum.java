import java.util.Random;
import java.util.Scanner;;
public class guessNum {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int toGuess = random.nextInt(100);
        while (true) {
            System.out.println("请输入数字: (1-100)");
            int num = sc.nextInt();
            if (num < toGuess) {
                System.out.println("低了低了格局低了");
            } else if (num > toGuess) {
                System.out.println("高！真高！");
            } else {
                System.out.println("猜对了");
                break;
            }
        }
        sc.close();
    }
}