package lec08.thread02.ninth;

public class ThreadMain {

    public static void main(String[] args) {

        CustomThread customThread = new CustomThread();
        CustomThread customThread2 = new CustomThread();
        CustomThread customThread3 = new CustomThread();

        customThread.start();
        customThread2.start();
        customThread3.start();

        customThread.setAvailable(false);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        customThread.setStop(true);
        customThread2.setStop(true);
        customThread3.setStop(true);

    }
}
