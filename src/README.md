# 백준 1000, 1001, 1008, 10998, 10869, 10430번 문제

# 1000번 문제 A+B

--- 
## 문제

--- 
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

## 입력

--- 
첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

## 출력

---
첫째 줄에 A+B를 출력한다.

## 코드

---
```
fun main(){
    val (a, b) = System.`in`.bufferedReader().use { reader ->
        print("연산에 사용될 피연산자를 입력해주세요 : ")
        // 공백 기준으로 정수 여러개 받아오기
        reader.readLine()!!.split(" ").map { it.toInt() }
    }

    // plus (백준 1000번 문제)
    println(a+b)
}

```

# 1001번 문제 A-B

--- 
## 문제

--- 
두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.

## 입력

--- 
첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

## 출력

---
첫째 줄에 A-B를 출력한다.

## 코드

```
fun main(){
    val (a, b) = System.`in`.bufferedReader().use { reader ->
        print("연산에 사용될 피연산자를 입력해주세요 : ")
        // 공백 기준으로 정수 여러개 받아오기
        reader.readLine()!!.split(" ").map { it.toInt() }
    }
    
    // minus (백준 10001번 문제)
    println(a-b)
}
```

# 10998번 문제 A*B

--- 
## 문제

--- 
두 정수 A와 B를 입력받은 다음, A*B를 출력하는 프로그램을 작성하시오.

## 입력

--- 
첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

## 출력

---
첫째 줄에 A*B를 출력한다.

## 코드
```
fun main(){
    val (a, b) = System.`in`.bufferedReader().use{ reader ->
        reader.readLine()!!.split(" ").map{ it.toInt()}
    }
    
    println(a*b)
}
```

# 1008번 문제 A/B

--- 
## 문제

--- 
두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.

## 입력

--- 
첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

## 출력

---
첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.

## 코드
```
fun main(){
    val (a, b) = System.`in`.bufferedReader().use{ reader ->
        reader.readLine()!!.split(" ").map{ 
            it.toDouble() // 실수형으로 바꿔준다.
        }
    }
    print(a/b)
}
```