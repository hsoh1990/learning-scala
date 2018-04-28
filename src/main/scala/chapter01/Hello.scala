package chapter01

object Hello {
  //함수 정의
  def printArgs(args: Range): Unit = {
    args.foreach(num => print(num + " "))   // args 에서 순회하는 메소드 호출
  }

  def main(args: Array[String]): Unit = {
    println("Hello Scala!!")
    println(1.+(2) + " " + (1 + 2)) //모든건 객체
    val  a = 10 // 변경 불가능한 변수
    //a = 11 당연 에러

    var b = 10 // 변경 가능한 변수 (val를 쓰는걸 권장)
    b = 11

    //반복문들
    for (i <- 0 to 10) { print(i + " ") }
    println()

    (0 to 10).foreach(num => print(num + " "))
    println()

    printArgs(0 to 10)
  }
}