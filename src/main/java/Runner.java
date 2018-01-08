import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        MagicEightBall eight_ball = new MagicEightBall();
        eight_ball.addAnswer("Absolutely 100% yes!");
        eight_ball.addAnswer("Naw");
        eight_ball.addAnswer("Get some perspective");
        System.out.println("What is your question?");
        Scanner scanner = new Scanner(System.in);
        String question = scanner.nextLine();
        System.out.println(eight_ball.randomAnswer());
        System.out.println("Add an answer to the Magic EightBall:");
        scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        eight_ball.addAnswer(answer);
    }

}
