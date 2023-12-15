package kadai_017;

public abstract class Kato_Chapter17 {
	
	//フィールド（内部データ）
	public String familyName = "加藤"; //姓
	public String givenName; //名
	public String address = "東京都中野区○×"; //住所
	
	//メソッド（共通の紹介を出力する）
	public void commonIntroduce() {
		System.out.println("名前は" + this.familyName + this.givenName + "です");
		System.out.println("住所は" + this.address + "です");
	}
	
	//メソッド（個別の紹介を出力する）
	abstract public void eachIntroduce();
	
	//メソッド（紹介を実行する）
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
		System.out.println("");
	}

}
