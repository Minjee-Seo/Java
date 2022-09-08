String a = "Hello World"; // 리터럴 표기
String a = new String("Hello World"); // 객체 생성

/* equals
두 문자열이 같은지 확인. */

String a = "Hello";
String b = "World";
System.out.println(a.equals(b)); // false 출력

// == 연산자를 이용할 경우 두 자료형이 동일한 객체인지를 판별함. */

/* indexOf
문자열에서 특정 문자가 시작되는 인덱스를 리턴 */

String a = "Hello World";
System.out.println(a.indexOf("World")); // 6 출력

/* contains
문자열에서 특정 문자열이 포함되어 있는지 여부를 리턴 */

System.out.println(a.contains("Hello")); // true 출력

/* charAt
문자열의 특정 인덱스의 문자를 리턴 */

System.out.println(a.charAt(0)); // H 출력

/* replaceAll
문자열 중 특정 문자열을 다른 문자열로 바꾸고자 할 때 */

System.out.println(a.replaceAll("Hello", "Hi")); // Hi World 출력

/* substring
문자열 중 특정 문자열을 뽑아낼 경우 */

System.out.println(a.substring(0,5)); // Hello 출력

/* toUpperCase, toLowerCase
문자열 전체를 대문자 or 소문자로 변경 */

System.out.println(a.toUpperCase()); // HELLO WORLD
System.out.println(a.toLowerCase()); // hello world

/* split
문자열을 특정 구분자로 분리 */

String a = "a:b:c:d";
String[] result = a.split(":"); // result는 {"a", "b", "c", "d"}

/* 문자열 포매팅
문자열 안의 특정 값을 바꿔야 할 경우 -> 문자열 안에 특정 값을 삽입 */

System.out.println(String.format("I have %d cars.", 3)); // I have 3 cars
int num = 3;
System.out.println(String.format("I have %d cars.", num)); // 위와 동일

System.out.println(String.format("I have %s cars.", "three")); // I have three cars



