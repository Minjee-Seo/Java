// 변수를 static으로 설정 시 항상 같은 메모리 주소를 참조함.

class HouseLee {
  static string lastname = "lee";
}

public class Sample {
  public static void main(String[] args) {
    HouseLee lee1 = new HouseLee();
    HouseLee lee2 = new HouseLee();
  }
}

// static method

class Counter {
  static int count = 0;
  Counter() {
    count++;
    System.out.println(count);
  }
  
  public static int getCount() {
    return count;
  }
}

public class Sample {
  public static void (String[] args) {
    Counter c1 = new Counter();
    Counter c2 = new Counter();
    
    System.out.println(Counter.getCount());
  }
} // 객체 생성 없이 클래스를 통해 메소드 직접 호출 가능.
