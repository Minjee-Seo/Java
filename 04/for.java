/*

for (초기값 ; 조건문 ; 증가값)

*/

String[] numbers = {"one", "two", "three"};

for (int i = 0; i<numbers.length; i++ ) {
  System.out.println(numbers[i]); }

// continue

int[] marks = { 90, 20, 10, 80, 70 };

for (int i = 00; i < marks.length; i++) {
  if (marks[i] < 50) continue;  
  System.out.println(marks[i]);
}
