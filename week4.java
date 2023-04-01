import java.util.Scanner;
import java.util.Random;

public class abc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        String[] options = {"가위", "바위", "보"};
        String userChoice = "";

        while (!userChoice.equals("그만")) {
            int computerChoice = random.nextInt(3);

            System.out.println("가위, 바위, 보 중 하나를 선택하세요 (그만 하려면 '그만'을 입력하세요):");
            userChoice = input.next();

            if (userChoice.equals("그만")) {
                System.out.println("게임을 종료합니다.");
                break;
            }

            System.out.println("컴퓨터가 선택한 것은 " + options[computerChoice] + "입니다.");

            if (userChoice.equals(options[computerChoice])) {
                System.out.println("비겼습니다!");
            } else if (userChoice.equals("가위") && options[computerChoice].equals("보")
                    || userChoice.equals("바위") && options[computerChoice].equals("가위")
                    || userChoice.equals("보") && options[computerChoice].equals("바위")) {
                System.out.println("당신이 이겼습니다!");
            } else {
                System.out.println("컴퓨터가 이겼습니다!");
            }
        }
    }
}