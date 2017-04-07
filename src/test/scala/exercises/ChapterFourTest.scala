
package exercises

import org.scalatest.FunSuite
import exercises.ChapterTwo._


import exercises.Option._


class ChapterFourTest extends FunSuite {

  test("testMean") {
    val arr = Array(1.0, 2.0, 3.0)
    val res = Option.mean(arr)
    assert(Some(2.0) == res)
    assert(Some(3.0) == res.map(_ + 1))

    val empty_arr: Array[Double] = Array()
    val opt = Option.mean(empty_arr)
    assert(None == opt)
  }

  test("testMap") {
    assert(Some(2) == Some(1).map(2 * _))
  }

  test("testGetOrElse") {
    assert(1 == None.getOrElse(1))
    assert(2 == Some(2).getOrElse(1))
  }
}
