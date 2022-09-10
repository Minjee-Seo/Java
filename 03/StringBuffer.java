// StringBuffer : 문자열 추가, 변경 시 사용

StringBuffer sb = new StringBuffer();

// 문자열 추가

sb.append("Hello");
sb.append(" ");
sb.append("World");

String result = sb.toString();

System.out.println(result); // Hello World

// insert : 해당 인덱스에 문자열 삽입

Stringbuffer sb = new StringBuffer();
sb.append("World");

sb.insert(0, "Hello "); // Hello World

// substring : 인덱싱

System.out.println(sb.substring(0,6)); // Hello
