package kadai_024;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {
	
	//【メソッド】自分のじゃんけんの手を入力する
	public String getMyChoice() {
		
		while(true) {
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
			//自分のジャンケンの手を入力する（Scannerクラス）
			Scanner scanner = new Scanner(System.in);
			
			//入力した内容を取得する
			String output = scanner.nextLine();
			
			if( output.equals("r") || output.equals("s") || output.equals("p")) {
				//入力した内容を返す
				scanner.close();
				return output;
			} else {
				System.out.println("ジャンケンの手が正しくないため、再度入力ください");
				continue;
			}
		}

	}
	
	
	//【メソッド】対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		
		//配列にじゃんけんの手をセットする
		String[] jankenHand = { "r", "s", "p" };
		
		//乱数で対戦相手のじゃんけんの手を選ぶ		
		 int val = (int)Math.round(Math.random() * 2);
		
		//じゃんけんクラスを実行するクラスに、対戦相手のじゃんけんの手を返す
		return jankenHand[val];
		
	}
		
		
	//【メソッド】じゃんけんを行う
	public void playGame(String me, String you) { //引数＝自分のじゃんけんの手
		
		//HashMapのキー・値をセット
		HashMap<String, String> jankenMap = new HashMap<String, String>();
		
		jankenMap.put( "r", "グー" );   //じゃんけんのグーを表す
		jankenMap.put( "s", "チョキ" ); //じゃんけんのチョキを表す
		jankenMap.put( "p", "パー" );   //じゃんけんのパーを表す
		
		//自分と対戦相手のじゃんけんを出力する
		System.out.println("自分の手は" + jankenMap.get(me) + 
				           ",対戦相手の手は" + jankenMap.get(you) );
		
		//自分と対戦相手のじゃんけんの手を比較し、結果を表示する
		if( me.equals(you) ) {
			System.out.println("あいこです");
		} else if( me.equals("r") && you.equals("s") ) {
			System.out.println("自分の勝ちです");
		} else if( me.equals("r") && you.equals("p") ) {
			System.out.println("自分の負けです");
		} else if( me.equals("s") && you.equals("r") ) {
			System.out.println("自分の負けです");
		} else if( me.equals("s") && you.equals("p") ) {
			System.out.println("自分の勝ちです");
		} else if( me.equals("p") && you.equals("r") ) {
			System.out.println("自分の勝ちです");
		} else if( me.equals("p") && you.equals("s") ) {
			System.out.println("自分の負けです");
		}
	}

}
