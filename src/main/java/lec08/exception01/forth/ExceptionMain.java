package lec08.exception01.forth;

public class ExceptionMain {

    public void divideMath(int parameter) throws ArithmeticException {

        if (parameter > 12) {
            System.out.println("1년에는 12개월에 최대입니다.");
            throw new ArithmeticException();
        } else {
            System.out.println("연봉이 3억일 경우 월급은");
            int calculateValue = 300000000 / parameter;
            System.out.println("월급 : " + calculateValue);
        }
    }

    public static void main(String[] args) {

        try {

            ExceptionMain exceptionMain = new ExceptionMain();
            exceptionMain.divideMath(12);

        } catch (ArithmeticException ae) {
            System.out.println("게산 예외 발생");
            ae.printStackTrace();
        } catch (Exception e) {
            System.out.println("예외 발생");
            e.printStackTrace();
        }
    }
}
