package chapter02

import org.scalatest.{BeforeAndAfterEach, FunSuite}

class DataStructureTupleTest extends FunSuite with BeforeAndAfterEach {
  var dataStructureTuple: DataStructureTuple = _

  override def beforeEach() {
    dataStructureTuple = new DataStructureTuple
  }

  test("testSampleTuple2") {
    println(dataStructureTuple.sampleTuple2)

    assert(dataStructureTuple.sampleTuple2._1 == 99)
    assert(dataStructureTuple.sampleTuple2._2 == "String")
  }

  test("testSimpleTuple3") {
    println(dataStructureTuple.simpleTuple2)

    assert(dataStructureTuple.simpleTuple2._1 == 99)
    assert(dataStructureTuple.simpleTuple2._2 == "String")
  }

  test("testSimpleTuple2") {
    println(dataStructureTuple.simpleTuple3)

    assert(dataStructureTuple.simpleTuple3._1 == 'h')
    assert(dataStructureTuple.simpleTuple3._2 == 's')
    assert(dataStructureTuple.simpleTuple3._3 == "oh")
  }

}
