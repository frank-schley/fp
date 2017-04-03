package exercises

import org.scalatest.FunSuite
import exercises.ChapterTwo._


/**
  * Created by frank on 3/4/17.
  */
class ChapterTwoTest extends FunSuite {

  test("testAbs") {
    assert(0 == abs(0))
    assert(1 == abs(-1))
    assert(1 == abs(1))
  }

  test("testFib") {
    /*
      Exercise 2.1
    */
    assert(0 == fib(0))
    assert(1 == fib(1))
    assert(1 == fib(2))
    assert(2 == fib(3))
    assert(3 == fib(4))
    assert(5 == fib(5))
    assert(8 == fib(6))
  }

  test("testIsSorted") {
    /*
      Exercise 2.2
    */
    def order(a:Int, b: Int) = a <= b

    assert(isSorted(Array[Int](), order))
    assert(isSorted(Array(1), order))
    assert(isSorted(Array(1, 2), order))
    assert(!isSorted(Array(2, 1), order))
  }

  test("testCurry") {
    /*
      Exercise 2.3 + 2.4
    */
    def add(a: Int, b:Int) = a + b
    def curried = curry(add)
    assert(2 == curried(1)(1))

    def uncurried = uncurry(curried)
    assert(2 == uncurried(1, 1))
  }
}
