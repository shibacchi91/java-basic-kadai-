package kadai_018;

//花子を表すクラス(子クラス)
public class KatoHanako_Chapter18 extends Kato_Chapter18 {
    
	public void setGivenName(String givenName) {
        this.givenName = givenName;
    }
	
	public KatoHanako_Chapter18() {
		setGivenName("花子");
	}

	// 花子の特有の情報を出力
	@Override
	public void eachIntroduce() {
		System.out.println("趣味は読書です");
	}
}