
public class SevenNumber {

    public static void main(String[] args) {
        // 1から100までの数値を順番に出力する
        for (int i = 0; i <= 100; i++) {

            int left = i / 10 ;
            int right = i % 10 ;
            // iの値が7の倍数or7を含む場合
            if (i % 7 == 0) {
                System.out.println("clap!");
            } else if (left == 7 || right == 7) {
                System.out.println("clap!");
            } else {
                System.out.println(i);
            }
        }
    }

}
