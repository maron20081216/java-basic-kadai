package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		// 100までの整数が素数か判定するboolean型の配列を作成・代入
		boolean[] primeJudge = new boolean[100];
		
		//作成したprimeJudge配列の要素を、for文で繰り返しtrueに初期化(true=素数、false=素数でない)
		for( int k = 1; k < primeJudge.length; k++ ) {
			primeJudge[k] = true;
		}
				
		// 繰り返し処理
		// 割られる数iが2～100まで繰り返す
		for( int i = 2; i <= 100; i++) {
			
			// 割る数rが2～割られる数になるまで、素数判定を繰り返す
			for ( int r = 2; r < i; r++ ) {
				if( i % r == 0) {
					primeJudge[i - 1] = false;
					break; // 素数でないと分かった時点で終了させる
				}
			}
		}
		
		// 素数を出力する
		for( int j = 0; j < primeJudge.length; j++) {
			if( primeJudge[j] == true ) {
				System.out.println(j + 1);
			}
		}
	}
}
