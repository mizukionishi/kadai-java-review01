
public class Review01 {

    public static void main(String[] args) {
        int price = 1500;
        int taxPrice = tax(price);
        int sellingPrice = price + taxPrice;
        System.out.println(price + "円の商品の税込み価格は" + sellingPrice + "円（消費税は" + taxPrice + "円）です。");

    }

    public static int tax(double price) {
        double taxRate = 0.1;
        int result = (int)((double)price * taxRate);
        return result;

        }

}
