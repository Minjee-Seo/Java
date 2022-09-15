// 보통 클래스는 파일 단위로 하나씩 작성함.

class Animal{
  string name;
  
  public void setName(String name) {
    this.name = name; // this : 생성된 객체를 지칭.
  }
}

public class Sample {
  public static void main(String[] args) {
    
    Animal cat = new Animal();
    cat.setName("kitty");
    System.out.println(cat.name);
    
  }
  
}

// 객체 변수는 공유되지 않는다!

public class Sample {
  public static void main(String[] args) {
    
    Animal cat = new Animal();
    Animal dog = new Animal();
    
    cat.setName("kitty");
    dog.setName("doggy");
    
    System.out.println(cat.name); // kitty
    System.out.println(dog.name); // doggy
    
  }
  
}
