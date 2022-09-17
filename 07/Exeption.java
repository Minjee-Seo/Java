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

Exeption : 컴파일 시 발생. 프로그램 작성 시 예측 가능한 오류
RuntimeExeption : 실행 시 발생. 오류 발생 할 수도 / 안 할 수도 있을 때.

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
        } catch (ArithmeticException e) { // c = -1 할당. e : 오류 객체.
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

// RuntimeExeption 상속하는 Exeption

class FoolException extends RuntimeException {
}

public class Sample {
    public void sayNick(String nick) {
        if("fool".equals(nick)) {
            throw new FoolException();
        }
        System.out.println("당신의 별명은 "+nick+" 입니다.");
    }

    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.sayNick("fool");
        sample.sayNick("genious");
    }
}

// Exeption 상속

class FoolException extends Exception {
}

public class Sample {
    public void sayNick(String nick) {
        try {
            if("fool".equals(nick)) {
                throw new FoolException();
            }
            System.out.println("당신의 별명은 "+nick+" 입니다.");
        }catch(FoolException e) {
            System.err.println("FoolException이 발생했습니다.");
        }
    }

    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.sayNick("fool");
        sample.sayNick("genious");
    }
}

