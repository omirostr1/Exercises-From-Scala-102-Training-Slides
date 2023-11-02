object pattern_Matching_exercise extends App{

  def cityCapitalisation(city: String): Unit = {
    city match {
      case "London" => println("LONDON")
      case "Edinburgh" => println("EDINBURGH")
      case "Belfast" => println("BELFAST")
      case "Cardiff" => println("CARDIFF")
      case _ => println(s"${city} isn't a UK capital")
    }
  }

  cityCapitalisation("London")
  cityCapitalisation("Edinburgh")
  cityCapitalisation("Belfast")
  cityCapitalisation("Cardiff")
  cityCapitalisation("Bristol")

}
