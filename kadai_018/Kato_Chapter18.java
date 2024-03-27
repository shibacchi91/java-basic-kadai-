package kadai_018;

//親クラス
abstract public class Kato_Chapter18 {
	// フィールド
	public String familyName = "加藤";
	public String givenName = "";
	public String address = "東京都中野区〇×";

	// 共通の紹介
	public void commonIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	}

	// 各クラスでの特有の情報を出力する抽象メソッド
	public abstract void eachIntroduce();



	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
		System.out.println();
	}
}