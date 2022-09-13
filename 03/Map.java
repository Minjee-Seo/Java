// Map : 파이썬 딕셔너리랑 비슷.

import java.util.HashMap; // HashMap

public class Sample {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>(); // key, value가 string 형태인 해시맵
        map.put("cat", "고양이"); // put 메소드 이용해 새 item 추가
        map.put("dog", "개");
    }
}

// get : key에 해당되는 value값 얻기
System.out.println(map.get("cat")); // "고양이"

/* key에 해당되는 value 값 없을 경우 null이 리턴됨.
이 때 null 대신 default 값을 리턴하기를 원할 시 getOrDefault 이용 */
System.out.println(map.getOrDefault("java", "자바")); // java라는 키 없을 시 "자바" return

// containsKey : 해당 키 있는지 여부 boolean으로 리턴
System.out.println(map.containsKey("people"));

// remove : 해당 키에 해당하는 아이템 삭제 후 value를 리턴
System.out.println(map.remove("people"));

// size : item 갯수 리턴
System.out.println(map.size());

// keySet : 맵의 모든 key를 모아서 Set 자료형으로 리턴
System.out.println(map.keySet());

//keySet은 List 자료형으로 변환 가능.
List<String> keyList = new ArrayList<>(map.keySet());

/* 다른 Map 자료형

LinkedHashMap : 입력된 순서대로 아이템 저장
TreeMap : key의 오름차순으로 저장

*/
ㅇㅏ잍

