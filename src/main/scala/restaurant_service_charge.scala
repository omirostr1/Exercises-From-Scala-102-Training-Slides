import scala.io.StdIn.readInt
import scala.io.StdIn.readChar

object restaurant_service_charge extends App{

  abstract class MenuItem(val cost: BigDecimal, val hot: Boolean)

  case object Cola extends MenuItem (0.50, false)
  case object Coffee extends MenuItem (cost = 1, hot = true)
  case object Cheese_Sandwich extends MenuItem (cost = 2, hot = false)
  case object Steak_Sandwich extends MenuItem (4.50, true)

  var finished: Boolean = false
  var total : BigDecimal = 0
  var tip : BigDecimal = 0

  def takeOrder(finished: Boolean) : Unit = {
    if (finished == true) {
      println(s"The total is $total and the tip suggested is $tip")
    } else {
      val catalogue: Map[Int, MenuItem] = Map(1 -> Cola, 2 -> Coffee, 3 -> Cheese_Sandwich, 4 -> Steak_Sandwich)
      println(catalogue)
      var choice = readInt()
      println(choice)
      println("Please enter quantity")
      var quantity = readInt()
      println(quantity)
      println("Finished(y/n)")
      var finished = readChar()
      println(finished)
    }
  }

  takeOrder(finished)


}
