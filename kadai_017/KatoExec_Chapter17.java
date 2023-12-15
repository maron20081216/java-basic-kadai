package kadai_017;

public class KatoExec_Chapter17 {

	public static void main(String[] args) {
		
		//各子クラスのインスタンスを作成する
		KatoTaro_Chapter17 katoTaro = new KatoTaro_Chapter17();
		KatoIchiro_Chapter17 katoIchiro = new KatoIchiro_Chapter17();
		KatoHanako_Chapter17 katoHanako = new KatoHanako_Chapter17();
		
		//setGiveNameメソッドを実行する
		katoTaro.setGivenName();
		katoIchiro.setGivenName();
		katoHanako.setGivenName();
		
		//execIntroduceメソッドを実行する
		katoTaro.execIntroduce();
		katoIchiro.execIntroduce();
		katoHanako.execIntroduce();
	}
}
