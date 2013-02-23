package com.rym82.dummy
import org.junit.Test

class ScalaMainTest {
  @Test
  def shouldSum() {
    def main = new ScalaMain
    assert (3 == main.sum (1, 2))
    assert (5 == main.sum (2, 3))
    assert (7 == main.sum (3, 4))
    assert (9 == main.sum (4, 5))
    assert (11 == main.sum (5, 6))
  }
}