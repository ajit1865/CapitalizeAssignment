
//Drive object to run the proram and check output
object Driver extends App {
  val objOfCapitalizeCharacterA = new CapitalizeCharacterA
  val input = List("ajmar ", "aamir ", "america ")

  //passing input as List[String] in getCapitalizedCharacter method
  println(objOfCapitalizeCharacterA.getCapitalizedCharacter(input))
}
