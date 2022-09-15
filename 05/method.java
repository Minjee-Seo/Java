// 클래스 내의 함수 : method.

public class Sample {
  
  // 메소드 생성
  int sum(int a, int b) {
    return a + b;
  }
  
  // main
  public static void main(String[] args) {
    int a = 3;
    int b = 5;
    
    Sample sample = new Sample();
    
    System.out.println(sample.sum(a,b)); // 8 출력
  }
}

/* 매개변수와 인수

매개변수 (parameter) : 메소드에 입력으로 전달된 값을 받는 변수
인수 (arguments) : 메소드를 호출할 때 전달하는 입력값

*/

// 입력값 없는 메소드 예시

public class Sample {
  String say(){
    return "Hi";
  }
  
  public static void main(String[] args) {
    
    Sample sample = new Sample();
    
    System.out.println(sample.say());
    
  }
}

// 리턴값 없도록

public class Sample {
  void say(){
    System.out.println("Hi");
  }
  
  public static void main(String[] args) {
    Sample sample = new Sample();
    sample.say();
  }
}

// 객체 넘기기

public class Sample {
  
  int a; // 객체변수
  
  void varTest(Sample sample) {
    sample.a++;
  }
  
  public static void main(String[] args) {
    Sample sample = new Sample();
    
    sample.a = 1;
    
    sample.varTest(sample);
    
    System.out.println(sample.a);
  }
}

