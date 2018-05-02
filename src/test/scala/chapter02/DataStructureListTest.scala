package chapter02

import org.scalatest.{BeforeAndAfterEach, FunSuite}

class DataStructureListTest extends FunSuite with BeforeAndAfterEach {

  var dataStructureList: DataStructureList = _

  override def beforeEach() {
    dataStructureList = new DataStructureList
  }

  test("testSimpleList") {
    println(dataStructureList.simpleList())
    // List 길이
    assertResult(10)(dataStructureList.simpleList().length)
    // List 요소 꺼내기
    assert(dataStructureList.simpleList()(1) == 1)
    // List 요소 합
    assert(dataStructureList.simpleList().sum == 45)
    // List 요소 합(reduce)
    assert(dataStructureList.simpleList().reduce((num1, num2) => num1 + num2) == 45)
  }

  test("testFillList") {
    println(dataStructureList.fillList())
    assertResult(3)(dataStructureList.fillList().length) // List 길이
    dataStructureList.fillList().foreach(data => assert(data == "hsoh")) // List 값 확인
  }

  test("testTabulateList") {
    println(dataStructureList.tabulateList())
    assertResult(3)(dataStructureList.tabulateList().length)
    assert(0 == dataStructureList.tabulateList()(0))
    assert(1 == dataStructureList.tabulateList()(1))
    assert(4 == dataStructureList.tabulateList()(2))
  }

  test("testAddFirst") {
    println(dataStructureList.addList())
    assertResult(4)(dataStructureList.addList().length)
    assert(1 == dataStructureList.addList()(0))
    assert(2 == dataStructureList.addList()(1))
    assert(3 == dataStructureList.addList()(2))
    assert(4 == dataStructureList.addList()(3))
  }

  test("testAddList") {
    println(dataStructureList.addFirst())
    assertResult(3)(dataStructureList.addFirst().length)
    assert(1 == dataStructureList.addFirst()(0))
    assert(2 == dataStructureList.addFirst()(1))
    assert(3 == dataStructureList.addFirst()(2))
  }

  test("testAddLast2") {
    println(dataStructureList.addLast())
    assertResult(3)(dataStructureList.addLast().length)
    assert(1 == dataStructureList.addLast()(0))
    assert(2 == dataStructureList.addLast()(1))
    assert(3 == dataStructureList.addLast()(2))
  }

  test("testAddLast") {
    println(dataStructureList.addLast2())
    assertResult(3)(dataStructureList.addLast2().length)
    assert(1 == dataStructureList.addLast2()(0))
    assert(2 == dataStructureList.addLast2()(1))
    assert(3 == dataStructureList.addLast2()(2))
  }

  test("testDropList") {
    println(dataStructureList.dropList())
    // List 길이
    assertResult(7)(dataStructureList.dropList().length)
  }

  test("testCountList") {
    println(String.valueOf(dataStructureList.countList()))
    assertResult(1)(dataStructureList.countList())
  }

  test("testCreateList") {
    println(dataStructureList.createList())
    assertResult(3)(dataStructureList.createList().length)
    assert(1 == dataStructureList.createList()(0))
    assert(2 == dataStructureList.createList()(1))
    assert(3 == dataStructureList.createList()(2))
  }

}
