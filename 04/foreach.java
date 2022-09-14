/*

for (type var: iterate) {
  body-of-loop
}

iterate에서 하나씩 순차적으로 var에 대입해 for문 수행.

*/

// 원래 for 문

String[] numbers = {"one", "two", "three"};
for (int i = 0; i < numbers.length ; i++) {
  System.out.println(numbers[i]); }

// for each

String[] numbers = {"one", "two", "three"};
for (String number: numbers) {
  System.out.println(number);
}

