
public class Clock {

    public static void main(String[] args) {
        getSeconds(18,32,47);

    }
    public static void getSeconds(int hour, int minutes, int seconds) {
            // 全部秒換算して足し算
            int result = hour * 60 * 60 + minutes * 60 + seconds;
            System.out.println(result +"秒");
    }

}
