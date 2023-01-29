
public class enumSample {

    // 列挙型Genderの定義
    public static enum Gender{
        男性,
        女性
    }

    public static void main(String[] args) {

        //Gender型の変数の宣言と初期化
        Gender gender5 = Gender.男性;
        Gender gender6 = Gender.女性;

        // genderの利用
        System.out.println(gender5);
        System.out.println(gender6);

        System.out.println(gender5.ordinal());
        System.out.println(gender6.ordinal());
    }

}
