object ice_cream_exercise extends App{

  trait Flavour

  case object Caramel extends Flavour
  case object Chocolate extends Flavour
  case object Cookie extends Flavour

  def iceCreamFlavor(flavor: String) {

    flavor match {
      case "Caramel" => println("caramel chew chew")
      case "Chocolate" => println("chocolate fudge brownie")
      case "Cookie" => println("cookie dough")
      case _ => println("original flavour")
    }
  }

  iceCreamFlavor("Chocolate")

}
