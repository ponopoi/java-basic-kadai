package kadai_028;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Jyanken_Chapter28 {
    private final Map<String, String> handMap = new HashMap<>();

    public Jyanken_Chapter28() {
        handMap.put("r", "グー");
        handMap.put("s", "チョキ");
        handMap.put("p", "パー");
    }

    public String getMyChoice() {
        Scanner scanner = new Scanner(System.in);
        String choice = "";

        System.out.println("自分のじゃんけんの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");

        while (true) {
            choice = scanner.nextLine().toLowerCase();
            if (handMap.containsKey(choice)) {
                break;
            } else {
                System.out.println("無効な入力です。r, s, pのいずれかを入力してください。");
            }
        }

        return choice;
    }

    public String getRandom() {
        String[] hands = {"r", "s", "p"};
        Random rand = new Random();
        int index = (int) Math.floor(rand.nextDouble() * 3);
        return hands[index];
    }

    public void playGame(String myChoice, String opponentChoice) {
        System.out.println("自分の手は" + handMap.get(myChoice) + ", 対戦相手の手は" + handMap.get(opponentChoice));

        if (myChoice.equals(opponentChoice)) {
            System.out.println("あいこです");
        } else if (
            (myChoice.equals("r") && opponentChoice.equals("s")) ||
            (myChoice.equals("s") && opponentChoice.equals("p")) ||
            (myChoice.equals("p") && opponentChoice.equals("r"))
        ) {
            System.out.println("自分の勝ちです");
        } else {
            System.out.println("自分の負けです");
        }
    }
}
