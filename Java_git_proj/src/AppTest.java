public class AppTest {
    public static void main(String[] args) {
        AndroidApp android = new AndroidApp("Clock");
        android.runApp();
        android.run_on_android();

        IphoneApp iphone = new IphoneApp("Timer");
        iphone.runApp();
        iphone.run_on_iPhone();
    }
}
