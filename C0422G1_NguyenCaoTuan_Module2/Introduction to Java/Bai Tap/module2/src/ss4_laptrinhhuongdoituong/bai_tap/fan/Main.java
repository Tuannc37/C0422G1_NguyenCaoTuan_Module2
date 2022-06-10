package ss4_laptrinhhuongdoituong.bai_tap.fan;

public class Main {
    public static void main(String[] args) {
        Fan fan_one = new Fan();
        fan_one.setSpeed(fan_one.FAST);
        fan_one.setRadius(10);
        fan_one.setColor("yellow");
        fan_one.setOn(true);
        System.out.println("Hiển thị quạt 1 : " + fan_one.toString());

        Fan fan_two = new Fan();
        fan_two.setSpeed(fan_two.MEDIUM);
        fan_two.setRadius(5);
        System.out.println("\nHiển thị quạt 2 : " + fan_two.toString());
    }
}
