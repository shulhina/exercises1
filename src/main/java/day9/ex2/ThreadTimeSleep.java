package day9.ex2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadTimeSleep extends Thread {
    private final String threadName;

    ThreadTimeSleep(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    static void printDateTime() {
        String str = "Current Date/Time : " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());
        System.out.println(str);
    }

    public void run() {
        System.out.println("Running " + threadName);
        printDateTime();
        // raised an error
        // Thread.sleep(10000);
        printDateTime();
    }
}
