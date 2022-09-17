/*

예외처리

try {
    ...
} catch(예외1) {
    ...
} catch(예외2) {
    ...
...
}

*/

// catch

public class Sample {
    public void shouldBeRun() {
        System.out.println("ok thanks.");
    }

    public static void main(String[] args) {
        Sample sample = new Sample();
        int c;
        try {
            c = 4 / 0; // ArithmeticException 발생 시
        } catch (ArithmeticException e) { // c = -1
            c = -1;
        }
    }
}

// finally : 반드시 실행되어야 하는 메소드

public class Sample {
    public void shouldBeRun() {
        System.out.println("ok thanks.");
    }

    public static void main(String[] args) {
        Sample sample = new Sample();
        int c;
        try {
            c = 4 / 0;
        } catch (ArithmeticException e) {
            c = -1;
        } finally {
            sample.shouldBeRun();  // 예외에 상관없이 무조건 수행된다.
        }
    }
}
