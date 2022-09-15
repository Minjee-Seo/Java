// 메소드에 객체를 전달할 경우 메소드에서 객체의 객체변수 (속성) 값을 변경 가능.

class Updater {
  void update(int count) {
    count++;
  }
}

class Counter {
  int count = 0;
}

public class Sample {
  public static void main(String[] args) {
    Counter counter = new Counter();
    System.out.println("before update: "+counter.count);
    
    Updater updater = new Updater();
    updater.update(counter.count);
    System.out.println("after update: "+counter.count);
  }
}

// 위의 경우 update 메소드에 값이 전달되기 때문에 counter 안의 count 변수의 값이 변하지 않는다.

class Updater {
  void update(Counter counter) { // 객체를 넘겨주기.
    counter.count++;
  }
}

class Counter {
  int count = 0;
}

public class Sample {
  public static void main(String[] args) {
    Counter counter = new Counter();
    System.out.println("before update: "+counter.count);
    
    Updater updater = new Updater();
    updater.update(counter);
    System.out.println("after update: "+counter.count); // 객체 안의 값 변함
  }
}

