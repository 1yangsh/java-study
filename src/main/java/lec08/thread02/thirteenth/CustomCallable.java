package lec08.thread02.thirteenth;

import java.util.concurrent.Callable;

public class CustomCallable implements Callable<String> {

    private String name;

    public CustomCallable(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        int index = 0;
        Thread.sleep(500);
        System.out.println(index + " ::: " + name);
        index++;
        return null;
    }
}
