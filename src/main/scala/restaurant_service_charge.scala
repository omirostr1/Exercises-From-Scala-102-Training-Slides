import java.awt.MenuItem
import scala.io.StdIn.readInt
import scala.io.StdIn.readLine

object restaurant_service_charge extends App{

  abstract class MenuItem(val cost: BigDecimal, val food: Boolean, val hot: Boolean, val premium: Boolean)

  case object Cola extends MenuItem (0.50, false, false, false)
  case object Coffee extends MenuItem (cost = 1, false, hot = true, false)
  case object Cheese_Sandwich extends MenuItem (cost = 2, true, hot = false, false)
  case object Steak_Sandwich extends MenuItem (4.50, true, true, false)
  case object Lobster extends MenuItem(25, food = true, hot = true, premium = true)

  var total : BigDecimal = 0
  var tip : BigDecimal = 0
  var foodExists : Boolean = false
  var isHot: Boolean = false
  var isPremium: Boolean = false

  def takeOrder(finished: Boolean) : Unit = {
    def accumulator(finished: Boolean) : Unit = {
      println(finished)
      if (finished == true) {
        if ( isPremium == true) {
          tip = total * 25 / 100
          if (tip > 40) tip = 40
        } else if ( isHot == true) {
          tip = total * 20/100
          if (tip > 20) tip = 20
        } else if (foodExists) {
          tip = total * 10/100
        } else {
          tip = 0
        }
        println(s"The total is $total and the tip suggested is $tip")
      } else {
        val catalogue: Map[Int, MenuItem] = Map(1 -> Cola, 2 -> Coffee, 3 -> Cheese_Sandwich, 4 -> Steak_Sandwich,
          5 -> Lobster)
        println(catalogue)
        var choice = readInt()
        println(choice)
        println("Please enter quantity")
        var quantity = readInt()
        println(quantity)
        choice match {
          case 1 => total += catalogue(choice).cost * quantity
          case 2 => total += catalogue(choice).cost * quantity
          case 3 => total += catalogue(choice).cost * quantity
          case 4 => total += catalogue(choice).cost * quantity
          case 5 => total += catalogue(choice).cost * quantity
          case _ => println("Error! Please enter a valid option.")
        }
        if (catalogue(choice).premium == true) isPremium = true
        if (catalogue(choice).food == true) foodExists = true
        if (catalogue(choice).hot == true & catalogue(choice).food == true) isHot = true
        println(foodExists, isHot)
        println("Finished(y/n)")
        var finishedOneChar = readLine()
        println(finishedOneChar)
        if (finishedOneChar == "y") {
          println("Do you have a Loyalty card?(y/n)")
          var loyalty = readLine()
          if (loyalty == "y" & isPremium == false) {
            println("How many stars do you have?")
            var stars = readInt()
            if (stars >= 3 & stars <= 8) total = total * (100 - stars * 2.5)/100
          }
          accumulator(finished = true)
        } else if (finishedOneChar == "n") {
          accumulator(finished = false)
        } else {
          println("Error! Please enter a valid option.")
        }
      }
    }

    accumulator(false)

  }

  takeOrder(false)


}
