package chapter02

import org.scalatest.{BeforeAndAfterEach, FunSuite}

class DataStructureArrayTest extends FunSuite with BeforeAndAfterEach {

  var dataStructureArray: DataStructureArray = _

  override def beforeEach() {
    dataStructureArray = new DataStructureArray
  }

  test("testMyArray") {
    println(dataStructureArray.myArray()(0))
    println(dataStructureArray.myArray()(1))
    // Array 데이터 가져오기

    assert(dataStructureArray.myArray().apply(0) == "hsoh")
    assert(dataStructureArray.myArray().apply(1) == "bmj")

    assert(dataStructureArray.myArray()(0) == "hsoh")
    assert(dataStructureArray.myArray()(1) == "bmj")
    // Array의 하나 이상의 값을 괄호로 호출하면 apply함수로 변경하여 호출
    // Array에서 ()는 해당 index값을 꺼냄
  }

  test("simpleArray") {
    // 동일한 동작을 수행
    println(dataStructureArray.myArray()(0))
    println(dataStructureArray.myArray()(1))

    assert(dataStructureArray.myArray().apply(0) == "hsoh")
    assert(dataStructureArray.myArray().apply(1) == "bmj")

    assert(dataStructureArray.myArray()(0) == "hsoh")
    assert(dataStructureArray.myArray()(1) == "bmj")
  }

}
