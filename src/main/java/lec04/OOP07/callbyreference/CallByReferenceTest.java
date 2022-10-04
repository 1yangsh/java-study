package lec04.OOP07.callbyreference;

public class CallByReferenceTest {

    public static int primitiveMethod(int value) {
        return value += 1;
    }

    public static void main(String[] args) {

        int value = 0;
        System.out.println("value = " + value);

        int returnValue = primitiveMethod(value);

        System.out.println("value = " + value);
        System.out.println("returnValue = " + returnValue);

        Aclass aclass = new Aclass();
        aclass.setValue(1);
        System.out.println("aClass 변수 value 값 : " + aclass.getValue() );

        callByReferenceMethod(aclass);
        System.out.println("aClass 파라미터를 이용한 변경 시 value 값 : " + aclass.getValue());
    }

    public static class Aclass {
        private int value = 0;

        public int getValue() {
           return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

    public static void callByReferenceMethod(Aclass aClass) {
        aClass.setValue(aClass.getValue() + 1);
    }
}
