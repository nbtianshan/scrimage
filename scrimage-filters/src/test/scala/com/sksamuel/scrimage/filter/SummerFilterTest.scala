package com.sksamuel.scrimage.filter

import com.sksamuel.scrimage.Image
import org.scalatest.FunSuite

/** @author Stephen Samuel */
class SummerFilterTest extends FunSuite {

  val original = Image(getClass.getResourceAsStream("/bird_small.png"))

  ignore("summer filter output matches expected") {
    val expected = Image(getClass.getResourceAsStream("/com/sksamuel/scrimage/filters/bird_small_summer.png"))
    assert(original.filter(SummerFilter()) === expected)
  }
}
