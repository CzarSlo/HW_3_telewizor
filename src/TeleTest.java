public class TeleTest {
    public static void main(String[] args) {
        Televisor tv = new Televisor("tv off");

        System.out.println(tv.status);

        tv.turnOn();
        tv.turnOff();
    }

}
