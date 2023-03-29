class CapitalizeCharacterA {

  //method that contain all functionality to convert small 'a' to capital 'A'
  def getCapitalizedCharacter(inputString: List[String]): List[String] = {

    //checking for exception if list is empty
    if (inputString.isEmpty) throw new IllegalArgumentException("Empty List")
    else {
      // for comprehension used to visit each character and store it in result val
      val result = for {
        n1 <- inputString
      } yield if (n1.contains("a")) n1.replace("a", "A") else n1
      result
    }
  }
}
