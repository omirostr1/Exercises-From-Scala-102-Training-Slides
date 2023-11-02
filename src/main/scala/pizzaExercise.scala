object pizzaExercise extends App{

  class Crust(val crust: List[String])
  case class Pizza(size: Int = 9, crust: String)

  case class Personal(size: Int = 7) extends Crust(List("classic"))
  case class Small(size: Int = 9) extends Crust(List("classic", "italian"))
  case class Medium(size: Int = 11) extends Crust(List("classic", "italian", "stuffed"))
  case class Large(size: Int = 14) extends Crust(List("classic", "italian", "stuffed"))


  def pizzaPrice(pizza: Pizza): Unit = {

    var total: Double = 0

    if ((pizza.size == 11) || (pizza.size == 14)) {

      pizza.crust match {
        case "stuffed" => total += 2.99
        case _ => total
      }

    }

    pizza.size match {
      case 7 => total += 5.99
      case 9 => total += 10.99
      case 11 => total += 12.99
      case 14 => total += 14.99
    }

  println(total)

  }

  pizzaPrice(Pizza(7, "stuffed"))

}
