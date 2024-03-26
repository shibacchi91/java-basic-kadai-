package kadai_018;

//太郎を表すクラス(子クラス)

public class KatoTaro_Chapter18 extends Kato_Chapter18 {
	public KatoTaro_Chapter18() {
		setGivenName("太郎");
	}

	// 太郎の特有の情報を出力
	@Override
	public void eachIntroduce() {
		System.out.println("Javaが得意です");
	}
}