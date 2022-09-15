class Animal {
  String name;
  
  void setName(String name) {
    this.name = name;
  }
}

class Dog extends Animal {} // Animal class를 상속 : extend 키워드 이용

// 부모 클래스의 기능 확장

class Animal {
  String name;
  
  void setName(String name) {
    this.name = name;
  }
}

class Dog extends Animal {
  void sleep() {
    System.out.println("zzz");
  }
}

public class Sample {
  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.setName("doggy");
    System.out.println(dog.name);
    dog.sleep();
  }
}

/*

메소드 오버라이딩 : 부모 클래스의 메소드를 자식 클래스가 동일한 형태로 다시 구현하는 것. 자식 클래스의 메소드가 더 높은 우선순위를 가짐.
메소드 오버로딩 : 부모 클래스의 메소드와 동일한 이름의 메소드를 생성 -> 메소드의 입력 항목이 다를 경우에만 가능.

*/
