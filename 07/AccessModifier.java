/* 접근제어자

변수나 메소드의 사용 권한을 설정.
private / default / protected / public

*/

// private : 해당 클래스에서만 접근 가능

public class Sample {
  private String secret;
  private String getSecret(); {
    return this.secret();
  }
} // 오직 sample class에서만 secret, getSecret 접근 가능.

// default : 해당 패키지 내에서만 접근 가능

// protected : 동일 패키지의 클래스 또는 해당 클래스를 상속받은 다른 패키지의 클래스에서만 접근 가능.

// Public : 모든 클래스에서 접근 가능
