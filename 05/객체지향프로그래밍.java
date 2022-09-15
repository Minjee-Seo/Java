// 계산기 class 정의하기

class Calculater {
  int result = 0;
  
  int add(int num) {
    result += num;
    return result;
  }
  
}

public class Sample {
  public static void main(String[] args) {
    Calculater cal1 = new Calculater();
    Calculater cal2 = new Calculater();
    
    System.out.println(cal1.add(3));
    System.out.println(cal2.add(4));
  }
}
