package kadai_026;

public class JyankenExec_Chapter26 {
	public static void main(String[] args) {
		Jyanken_Chapter26 game = new Jyanken_Chapter26();
		String myChoice = game.getMyChoice();//自分のじゃんけんの手を入力
		game.playGame(myChoice);//じゃんけんの結果を計算して出力
	}
}