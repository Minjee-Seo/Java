/*

while ( 조건문 ) {
 < 수행할 문장 1 >;
 < 수행할 문장 2 >;
 < 수행할 문장 ... >;
 }

*/

int a = 0;

while (a < 10 ) {
  a++;
  
  if (a % 2 == 0) continue; // 홀수만 출력. while loop 처음으로 돌아감
  
  System.out.println(a);
  
}
