package chapter02

class DataStructureArray {
  def myArray(): Array[String] = {
    val a = new Array[String](2) // Array 객체 생성
    // JAVA ->  String a[] = new String[2]

    a(0) = "hsoh"
    a(1) = "bmj" // 데이터 임력

    //a.update(0, 'hsoh')
    //a.update(1, 'bmj') 이와 같은 동작을 수행

    a // 마지막에 쓰는 값을 return 함
  }

  def simpleArray(): Array[String] = {
    Array.apply("hsoh", "bmj")
    // 마지막에 쓰는 값을 return 하기 떄문에 Array가 return
  }
}
