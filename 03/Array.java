// 길이가 고정, 선언 시 길이 정해줘야 함

int[] numbers = {1, 2, 3, 4, 5};
string[] letters = {"a", "b", "c", "d", "e"}; // 배열 선언 시 초기화

string[] letters = new string[5];
string[0] = "a";
string[1] = "b";
string[2] = "c";
string[3] = "d";
string[4] = "e"; // 먼저 빈 배열 선언 후 인덱싱으로 요소 넣기

// 배열 길이 확인 : .length

for (int i=0; i<letters.length; i++) {
    System.out.println(weeks[i]);
}
