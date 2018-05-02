package chapter02

class DataStructureList {

  def simpleList(): List[Int] = List.range(0, 10)

  def fillList(): List[String] = List.fill(3)("hsoh")

  def tabulateList(): List[Int] = List.tabulate(3)(n => n * n)

  // List(3, 4).:::(List(1, 2))
  def addList(): List[Int] = List(1, 2) ::: List(3, 4)

  // List(2, 3).::(1)
  def addFirst(): List[Int] = 1::List(2,3)

  //리스트가 길어지면 성능문제 발생
  def addLast(): List[Int] =  List(1,2):+3

  // List(1,2) ::: List(3)
  def addLast2(): List[Int] = (3 :: List(1,2).reverse).reverse

  //List 요소 제거 -> 현재 List의 요소를 제거하여 새로운 List return
  def dropList(): List[Int] = this.simpleList().drop(3)

  // count는 람다식을 받음  -> bool  func ( s ) { return s.length == 3 }
  def countList(): Int = List ("hello", "world", "boy").count(data => data.length == 3)

  def createList(): List[Int] = 1::2::3::Nil


}
