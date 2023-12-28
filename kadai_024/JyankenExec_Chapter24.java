package kadai_024;

public class JyankenExec_Chapter24 {

    public static void main(String[] args) {

        //じゃんけんクラスのインスタンスを作成する
        Jyanken_Chapter24 janken = new Jyanken_Chapter24();

        //自分のじゃんけんの手を入力する
        String me = janken.getMyChoice();

        //対戦相手のじゃんけんの手が乱数で選ばれる
        String you = janken.getRandom();

        //じゃんけんの結果を出力する
        janken.playGame(me, you);
    }

}
