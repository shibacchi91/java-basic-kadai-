package kadai_021;

//辞書クラス
import java.util.HashMap;

public class Dictionary_Chapter21 {

	public void searchWord() {
		//HashMap
		HashMap<String, String> meaning = new HashMap<>();
			
		meaning.put("apple", "りんご");
		meaning.put("peach", "桃");
		meaning.put("banana", "バナナ");
		meaning.put("lemon", "レモン");
		meaning.put("pear", "梨");
		meaning.put("kiwi", "キウィ");
		meaning.put("strawberry", "いちご");
		meaning.put("grape", "ぶどう");
		meaning.put("muscat", "マスカット");
		meaning.put("cherry", "さくらんぼ");
			
		String searchWord[] = new String[4];
		
		searchWord[0] = "apple";
		searchWord[1] = "banana";
		searchWord[2] = "grape";
		searchWord[3] = "orange";
		
		for(String word : searchWord) {
			boolean presence = meaning.containsKey(word);
			if(presence) {
				System.out.println(word + "の意味は" + meaning.get(word));
			}else {
				System.out.println(word + "は辞書に存在しません");
			}
		}
	}
}