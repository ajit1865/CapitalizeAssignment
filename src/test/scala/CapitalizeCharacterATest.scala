import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers.{an, be}

class CapitalizeCharacterATest extends AnyFlatSpec {
  //created object of CapitalizeCharacterA to access method
  val objofMainClass = new CapitalizeCharacterA

  it should "check weather all small 'a' capitalized to capital A" in {
    assert(objofMainClass.getCapitalizedCharacter(List("My", "name", "is", "Michael", "Scott")) == List("My", "nAme", "is", "MichAel", "Scott"))
  }

  it should "check weather all small 'a' capitalized to capital A in given List[String]" in {
    assert(objofMainClass.getCapitalizedCharacter(List("ajmar ", "aamir ", "america ")) == List("AjmAr ", "AAmir ", "AmericA "))
  }

  it should "throw an Exception if list contains negative value" in {
    an[IllegalArgumentException] should be thrownBy {
      objofMainClass.getCapitalizedCharacter(List())
    }
  }

}
