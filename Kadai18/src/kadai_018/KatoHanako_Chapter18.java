package kadai_018;

//花子を表すクラス(子クラス)
public class KatoHanako_Chapter18 extends Kato_Chapter18 {
    public KatoHanako_Chapter18() {
        givenName = "花子";
    }

    @Override
    public void eachIntroduce() {
        System.out.println("趣味は読書です");
    }
}