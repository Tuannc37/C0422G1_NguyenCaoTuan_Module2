package ss4_laptrinhhuongdoituong.bai_tap.stopwatch;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        long sum = 0;
        for (long i = -100000000; i < 1000000000; i++) {
            sum += i;
        }
        stopWatch.end();
        System.out.print("Thời gian là " + stopWatch.getElapsedTime());

    }
}
