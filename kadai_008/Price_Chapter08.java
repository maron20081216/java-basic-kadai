package kadai_008;

public class Price_Chapter08 {

	public static void main(String[] args) {
		// 年齢を宣言・代入する
		int age = 30;
		
		// 年代を表すint変数「useAge」を宣言・初期化する
		int userArea = 0;

		// サービスの使用料金を表すint変数「serviceCost」を宣言・初期化する
		int serviceCost = 0;
		
		// 年代に応じて年代・料金を代入する
		if( age < 20 ) {
			userArea = 10;
			serviceCost = 1000;
		} else if( age < 30 ) {
			userArea = 20;
			serviceCost = 2000;
		} else if( age < 40 ) {
			userArea = 30;
			serviceCost = 3000;
		} else if( age < 50 ) {
			userArea = 40;
			serviceCost = 3000;
		} else if( age < 60 ) {
			userArea = 50;
			serviceCost = 4000;
		} else if( age < 70 ) {
			userArea = 60;
			serviceCost = 4000;
		} else if( age < 80 ) {
			userArea = 70;
			serviceCost = 4000;
		} else if( age < 90 ) {
			userArea = 80;
			serviceCost = 5000;
		} else {
			serviceCost = 500;
		}

		// 複数の条件分岐により導き出された料金を取得
		switch(userArea) {
		case 10,20,30,40,50,60,70,80 -> System.out.print( userArea + "代の料金は" + serviceCost + "円" );
		default -> System.out.print( "90代以上の料金は" + serviceCost + "円" );
		}
	}
}
