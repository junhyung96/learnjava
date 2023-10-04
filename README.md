# learnjava

# Day1

## 변수 조건

- 대소문자를 구분함
- 공백은 허용되지 않는다
- 숫자로 시작할 수 없다
- $ 와 _ 를 변수이름에 사용할 수 있다. 이외의 특수문자는 허용하지 않는다
- 예약어(자바문법에 사용되는 단어)는 사용할 수 없다
- 합성어의 경우 주로 camelCase를 활용한다
- 한글을 이용한 변수 작명 가능(권장하지 않음)

# Day2

## 배열 Array

- 같은 종류의 데이터를 저장하기 위한 자료구조
- 크기가 고정되어 있음(한번 생성된 배열은 크기를 바꿀 수 없음)
- 배열을 객체로 취급(참조형)
- 배열의 요소를 참조하려면 배열 이름과 색인(index)을 음이 아닌 정수 값을 조합하여 사용
- index로 각 요소에 접근, 0부터 시작
- 배열이름.length를 통해 배열의 길이 조회 가능
- 배열의 길이는 임의로 변경 불가함
- 길이 변경 필요시 새로운 배열을 생성 후 내용을 옮긴다

### 배열의 선언 : 타입[] 변수

|타입|배열이름|선언
|---|---|---|
|int|iArr|int[] iArr;|
|char|cArr|char[] cArr;|
|boolean|bArr|boolean[] bArr;|
|String|strArr|String[] strArr;|
|Date|dateArr|Date[] dateArr;|

### 배열의 생성과 초기화

1. 자료형[] 배열이름 = new 자료형[길이];
2. 자료형[] 배열이름 = new 자료형[] {값1, 값2, 값3, 값4};
3. 자료형[] 배열이름 = {값1, 값2, 값3, 값4}

### 배열의 순회

- 반복문을 이용하여 배열의 요소를 순회할 수 있음

```java
int intArray[] = { 1, 3, 5, 7, 9 };

for(int i=0; i<intArray.length; i++){
    System.out.println(intArray[i]);
}
// for-each를 통한 순회
for( int x : intArray ){
    System.out.println(x);
}

```

### 배열의 출력

```java
int iArr[] = { 1, 3, 5, 7, 9 }; 
System.out.println(Arrays.toString(iArr)); 
// 출력 [1, 3, 5, 7, 9]
```

### 배열의 복사

- 배열은 생성하면 길이 변경이 불가하기 때문에 더 큰 배열을 생성하고 이전 배열의 값을 복사 해야함
- 새로운 배열 = Arrays.copyOf(복사하고_싶은_배열, 새로운_배열의 크기)
- System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)

### 배열 실습

- 최대값, 최소값 찾기
  
```java
int[] intArray = {3, 27, 13, 8, 235, 7, 22, 9, 435, 31, 54};

// int min = 1000;
// int max = 0;
int max = Integer.MAX_VALUE;
int min = Integer.MIN_VALUE;
for(int num : intArray) {
    // if(num > max) {
    //     max = num;
    // }
    // if(num < min) {
    //     min = num;
    // }
    min = Math.min(min, num);
    max = Math.max(max, num);
}

System.out.printf("min: %d, max: %d%n", min, max);
```

- 빈도수 구하기

```java
int[] intArray = {3, 7, 2, 5, 7, 7, 9, 2, 8, 1, 1, 5, 3}

int[] used = new int[10];

for(int num:intArray){
    used[num]++;
}
System.out.println(Arrays.toString(used));
```

## 다차원 배열

- 2차원 이상의 배열을 의미

### 2차원 배열 선언

- int[][] iArr
- int iArr[][]
- int[] iArr[]

### 2차원 배열 생성

- 배열의 이름 = new 배열유형[1차원 배열개수][1차원 배열의 크기];
- 배열의 이름 = new 배열유형[1차원 베열개수][];

### 다차원 배열 출력

```java
int[][] iArr2 = {{ 0, 13, 5, 2 }, { 1, 3, 5, 7, 9 }}; 
System.out.println(Arrays.deepToString(iArr2));
```
