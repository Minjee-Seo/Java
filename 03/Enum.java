// 상수집합

public class Sample {
    enum CoffeeType {
        ESPRESSO,
        AMERICANO,
        LATTE
    };

    public static void main(String[] args) {
        System.out.println(CoffeeType.ESPRESSO); // ESPRESSO 출력
        System.out.println(CoffeeType.AMERICANO);
        System.out.println(CoffeeType.LATTE);
    }
}

// 반복문에서 사용하기

public class Sample {
    enum CoffeeType {
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    };

    public static void main(String[] args) {
        for(CoffeeType type: CoffeeType.values()) {
            System.out.println(type);  // 순서대로 AMERICANO, ICE_AMERICANO, CAFE_LATTE 출력
        }
    }
}
