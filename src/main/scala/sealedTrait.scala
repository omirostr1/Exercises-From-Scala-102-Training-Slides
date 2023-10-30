object sealedTrait extends App{

  sealed trait Temperature
  case object Cold extends Temperature
  case object Hot extends Temperature

  val weather: Temperature = Cold

  weather match {
    case Cold => //take a coat
    case Hot => //don't wear a coat
  }

}
