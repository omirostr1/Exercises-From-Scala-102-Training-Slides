object patternMatching extends App{

  val numApples: Int = 3

  numApples match {
    case 1 => //an apple
    case 2 => //a couple of apples
    case _ => //lots of apples
  }

  val thing: Int = 3

  thing match {
    case i: Int => //it is an integer
    case other => //something else
  }

  trait Temperature
  object Cold extends Temperature
  object Hot extends Temperature

  val weather: Temperature = Cold

  weather match {
    case Cold => //take a coat
    case Hot => //don't wear a coat
    case _ => //take nothing
  }

}
