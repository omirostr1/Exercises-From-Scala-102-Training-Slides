object dog_with_options extends App{

  case class Dog(name: String, age: Int, breed: String, spotsColour: Option[String])

  def colourSpotsWithGetOrElse(dog: Dog) : String = {
   dog.spotsColour.getOrElse("No spots")
  }

  def colourSpotsPatternMatching(dog: Dog) : Unit = {
    dog.spotsColour match {
      case None => println("No spots")
      case _ => println({dog.spotsColour.get})
    }
  }

  println(colourSpotsWithGetOrElse(Dog("Max", 2, "Bulldog", Some("brown"))))
  println(colourSpotsWithGetOrElse(Dog("Max", 2, "Bulldog", None)))
  colourSpotsPatternMatching(Dog("Max", 2, "Bulldog", Some("brown")))
  colourSpotsPatternMatching(Dog("Max", 2, "Bulldog", None))



}
