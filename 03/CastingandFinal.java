// 문자열을 정수로 변환 : parseInt

public class Sample {
    public static void main(String[] args) {
        String num = "123";
        int n = Integer.parseInt(num);
        System.out.println(n);  // 123 출력
    }
}

// 정수를 문자열로 변환

public class Sample {
    public static void main(String[] args) {
        int n = 123;
        String num = "" + n; // 그냥 숫자 앞에 빈 문자열 더해주면 문자열이 됨.
        System.out.println(num);  // 123 출력
    }
}

// 아니면 다음과 같은 메소드 이용

public class Sample {
    public static void main(String[] args) {
        int n = 123;
        String num1 = String.valueOf(n);
        String num2 = Integer.toString(n);
        System.out.println(num1);  // 123 출력
        System.out.println(num2);  // 123 출력
    }
}

// 문자열을 실수로 변환

public class Sample {
    public static void main(String[] args) {
        String num = "123.456";
        double d = Double.parseDouble(num);
        System.out.println(d);
    }
}

// 캐스팅

public class Sample {
    public static void main(String[] args) {
        int n1 = 123;
        double d1 = n1;  // 정수를 실수로 바꿀때에는 캐스팅이 필요없다.
        System.out.println(d1);  // 123.0 출력

        double d2 = 123.456;
        int n2 = (int) d2; // 실수를 정수로 바꿀때에는 반드시 정수형으로 캐스팅해 주어야 한다.
        System.out.println(n2);  // 소숫점이 생략된 123 출력
    }
}

// final : 자료형에 값을 단 한 번만 설정하도록. 값 변경 불가능.

public class Sample {
    public static void main(String[] args) {
        final int n = 123;  // final 로 설정하면 값을 바꿀수 없다.
        n = 456;  // 컴파일 에러 발생
    }
}

public class Sample {
    public static void main(String[] args) {
        final ArrayList<String> a = new ArrayList<>(Arrays.asList("a", "b"));
        a = new ArrayList<>(Arrays.asList("c", "d"));  // 컴파일 에러 발생
    }
} // 리스트의 경우 -> add나 remove는 가능. 아예 수정 불가능하게 하려면 List.of 이용할 것.
