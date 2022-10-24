package lec06.interface03.first;

public interface SampleInterface {
    // interface, abstract는 클래스의 뼈대를 만들는 과정

    public void interfaceMethod();

    public abstract void abstractMethod();

    public String OS_NAME = "windows10";
    public final static String DOWNLOAD_PATH = "C:/";

    public class sampleFirst {
        public int sampleCount = 3;
    }

    public static class sampleStaticClass {
        public static int staticSampleCount = 1;
    }

    public interface innerInterface {
        public void showMsg();
    }

    public enum D {CREATE, READ, UPDATE, DELETE};

    public default void defaultMethod() {
        System.out.println("기본 메서드 입니다. 자바 1.8 이후부터 사용 가능합니다");
    }

    public static void staticVoidMethod() {
        System.out.println("static 메소드도 사용 가능합니다.");
    }

    private void privateMethod() {
        System.out.println("interface 내부의 private 메서드 입니다. 자바 11버전 이후분터 사용합니다.");
    }

    default void callPrivateMethodInmDefaultMethod() {
        privateMethod();
    }

}
