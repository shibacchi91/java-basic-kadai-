package kadai_018;

//一郎を表すクラス(子クラス)
public class KatoIchiro_Chapter18 extends Kato_Chapter18 {
    public KatoIchiro_Chapter18() {
    	setGivenName("一郎");
    }

    // 一郎の特有の情報を出力
    @Override
    public void eachIntroduce() {
        System.out.println("好きな食べ物はリンゴです");
    }
}