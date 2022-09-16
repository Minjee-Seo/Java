/* 생성자 : 객체변수 값을 무조건 설정해야만 객체가 생성될 수 있도록 강제함.

메소드명이 클래스명과 동일하고 리턴 자료형을 정의하지 않는 메소드
객체가 생성될 때 호출됨 

오버로딩 가능 : 입력 항목이 다른 이름 같은 생성자 여러 개 만들 수 있음.

*/



class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    Dog() {} // 디폴트 생성자
    void sleep() {
        System.out.println(this.name + " zzz");
    }
}

class HouseDog extends Dog {
    HouseDog(String name) { // 생성자. 객체 만들 때 무조건 name에 string 형태로 넣어줘야 함.
        this.setName(name);
    }
    void sleep() {
        System.out.println(this.name + " zzz in house");
    }

    void sleep(int hour) {
        System.out.println(this.name + " zzz in house for " + hour + " hours");
    }
}

public class Sample {
    public static void main(String[] args) {
        HouseDog houseDog = new HouseDog("happy");
        houseDog.sleep();
        houseDog.sleep(3);
    }
}

