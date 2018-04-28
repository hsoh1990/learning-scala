package chapter01

import org.scalatest.{BeforeAndAfterEach, FunSuite}

class AdderTest extends FunSuite with BeforeAndAfterEach {

  var adder: Adder = _

  override def beforeEach() {
    adder = new Adder

  }

  override def afterEach() {

  }

  test("testAdd") {
    assert(adder.add(1, 2) == 3)
  }

}
