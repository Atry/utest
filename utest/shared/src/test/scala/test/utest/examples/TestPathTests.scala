package test.utest.examples

import utest._

object TestPathTests extends TestSuite{
  val tests = this{
    'testPath{
      'foo {
        assert(implicitly[utest.framework.TestPath].value == Seq("testPath", "foo"))
      }
    }
  }
}