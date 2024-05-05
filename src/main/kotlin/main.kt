fun main(){
    val (a, b) = System.`in`.bufferedReader().use { reader ->
        print("연산에 사용될 피연산자를 입력해주세요 : ")
        // 공백 기준으로 정수 여러개 받아오기
        reader.readLine()!!.split(" ").map { it.toInt() }
    }

    // plus (백준 1000번 문제)
    println(a + b)

    // minus (백준 1001번 문제)
    println(a - b)

    // multiple(백준 10998번 문제)
    println(a * b)

    // divide(백준 1008번 문제)
    val num1 = a.toDouble()
    val num2 = b.toDouble()
    println(num1 / num2)

}