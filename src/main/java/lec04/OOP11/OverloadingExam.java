package lec04.OOP11;

public class OverloadingExam {

    // Overloading
    public int calculate() {
        return 1 + 2;
    }
    public int calculate(int one, int two) {
        return 1 + 2;
    }
    public long calculate(long one, long two) {
        return 1 + 2;
    }
    public long calculate(int one, long two) {
        return 1 + 2;
    }
    public long calculate(long one, int two) {
        return 1 + 2;
    }

    public long calculateLong(long one, long two) {
        return one + two;
    }

}
