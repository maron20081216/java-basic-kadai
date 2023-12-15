package kadai_020;

import java.util.HashMap;

public class Dictionary_Chapter20 {
	
	//【メソッド】調べる英単語が辞書に追加されているか判定
	//word：調べる英単語
	public void lookupWord( String word ) {
		
		//HashMap宣言（英単語の辞書として機能させる）
		HashMap<String, String> dictionaryMap = new HashMap<String, String>();
		
		//辞書に英単語と意味を追加
		dictionaryMap.put("apple","りんご");
		dictionaryMap.put("peach","桃");
		dictionaryMap.put("banana", "バナナ");
		dictionaryMap.put("lemon", "レモン");
		dictionaryMap.put("pear", "梨");
		dictionaryMap.put("kiwi", "キウィ");
		dictionaryMap.put("strawberry", "いちご");
		dictionaryMap.put("grape", "ぶどう");
		dictionaryMap.put("muscat", "マスカット");
		dictionaryMap.put("cherry", "さくらんぼ");
		
		if( dictionaryMap.get(word) == null ) {
			System.out.println( word + "は辞書に存在しません");
		} else {
			System.out.println( word + "の意味は" + dictionaryMap.get(word));
		}
	}
	
}

