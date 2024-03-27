package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

class Jyanken_Chapter26 {
	//自分のじゃんけんの手を入力するメソッド
	public String getMyChoice() {
		Scanner scanner = new Scanner(System.in);
		
		String choice;
		while (true) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			choice = scanner.nextLine();//改行までの入力を取得する

			//入力が正しいかチェック
			if (choice.equals("r") || choice.equals("s") || choice.equals("p")) {
				break;//正しい入力ならループを抜ける
			} else {
				System.out.println("正しいじゃんけんの手を入力してください。");
			}
		}
		scanner.close();
		return choice;
	}

	//対戦相手のじゃんけんの手を乱数で選ぶメソッド
	public String getRandom() {
		String[] choices = { "r", "s", "p" };
		int randomIndex = (int) (Math.random() * 3);
		return choices[randomIndex];
	}

	//じゃんけんの結果を計算して出力するメソッド
	public void playGame(String myChoice) {
		HashMap<String, String> handMap = new HashMap<>();
		handMap.put("r", "グー");
		handMap.put("s", "チョキ");
		handMap.put("p", "パー");
		//対戦相手のじゃんけんの手を乱数で選ぶ
		String opponentChoice = getRandom();

		//自分と対戦相手の手を取得
		String myHand = handMap.get(myChoice);
		String opponentHand = handMap.get(opponentChoice);

		//自分と対戦相手の手を出力
		System.out.println("自分の手は" + myHand + ", 対戦相手の手は" + opponentHand);

		//じゃんけんの結果を計算
		String result = "";
		if (myChoice.equals(opponentChoice)) {
			result = "あいこです";
		} else if ((myChoice.equals("r") && opponentChoice.equals("s"))
				|| (myChoice.equals("s") && opponentChoice.equals("p"))
				|| (myChoice.equals("p") && opponentChoice.equals("r"))) {
			result = "自分の勝ちです";
		} else {
			result = "自分の負けです";
		}
		//結果を出力
		System.out.println(result);
	}
}
