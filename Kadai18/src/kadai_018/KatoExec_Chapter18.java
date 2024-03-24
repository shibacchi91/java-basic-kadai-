package kadai_018;

public class KatoExec_Chapter18 {

	// TODO 自動生成されたメソッド・スタブ
	   public static void main(String[] args) {
	        // 太郎
		   KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
	        taro.execIntroduce();//名前と住所出力
	        taro.eachIntroduce(); // 太郎の特有の情報を出力
	        System.out.println("");//空白

	        // 一郎
	        KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
	        ichiro.execIntroduce();//名前と住所出力
	        ichiro.eachIntroduce(); // 一郎の特有の情報を出力
	        System.out.println("");//空白

	        // 花子
	        KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
	        hanako.execIntroduce();//名前と住所出力
	        hanako.eachIntroduce(); // 花子の特有の情報を出力
	        System.out.println("");//空白
	    }
}
