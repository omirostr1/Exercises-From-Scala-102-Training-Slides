import java.awt.MenuItem
import scala.io.StdIn.readInt
import scala.io.StdIn.readLine
import java.time.LocalDateTime
import scala.collection.immutable.ListMap

object restaurant_service_charge extends App{

  abstract class MenuItem(val cost: BigDecimal, val food: Boolean, val hot: Boolean, val premium: Boolean)

  case object Cola extends MenuItem (0.50, false, false, false)
  case object Coffee extends MenuItem (cost = 1, false, hot = true, false)
  case object Cheese_Sandwich extends MenuItem (cost = 2, true, hot = false, false)
  case object Steak_Sandwich extends MenuItem (4.50, true, true, false)
  case object Lobster extends MenuItem(25, food = true, hot = true, premium = true)

  case class Staff(name: String, wage: BigDecimal, monthsWorking: Int)

  val staff1 = Staff("Omiros", 1000, 1)
  val staff2 = Staff("Jim", 1500, 4)
  val staff3 = Staff("Ben", 1000, 2)
  val staff4 = Staff("Karen", 2000, 14)

  var total : BigDecimal = 0
  var tip : BigDecimal = 0
  var foodExists : Boolean = false
  var isHot: Boolean = false
  var isPremium: Boolean = false
  val happyHour: Boolean = false

  def currency(total: BigDecimal): BigDecimal = {
    var newTotal: BigDecimal = 0
    println("Choose the currency of your choice")
    val currency: Map[Int, String] = Map(1 -> "GBP", 2 -> "EUR", 3 -> "USD", 4 -> "AUD")
    println(currency)
    val currencyChoice = readInt()
    currencyChoice match {
      case 2 => newTotal = total * 1.14
      case 3 => newTotal = total * 1.22
      case 4 => newTotal = total * 1.92
      case _ => newTotal = total
    }
    newTotal
  }

  def happyHour(cost: BigDecimal, quantity: Int) : BigDecimal = {
    val now = LocalDateTime.now().getHour
    if (now >= 18 & now<=20) {
      (cost) / 2 * quantity
    } else {
      cost * quantity
    }
  }

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
        total = currency(total)
        return println(s"The total is $total and the tip suggested is $tip")
        return println(s"The time of transaction is ${LocalDateTime.now().getHour}:${LocalDateTime.now().getMinute}")
      } else {
        val catalogue: ListMap[Int, MenuItem] = ListMap(1 -> Cola, 2 -> Coffee, 3 -> Cheese_Sandwich, 4 -> Steak_Sandwich,
          5 -> Lobster)
        println(catalogue)
        var choice = readInt()
        println(choice) //comment
        println("Please enter quantity")
        val input = readLine()
        try {
          var quantity = input.toInt
          if (quantity >= 0) {
            //println(quantity)
          } else {
            return println("Error! Please enter a valid option.")
          }
        } catch {
          case _: NumberFormatException =>
            return println("Error! Please enter a valid integer.")
        }
        var quantity = input.toInt
        choice match {
          case 1 => total += happyHour(catalogue(choice).cost, quantity)
          case 2 => total += happyHour(catalogue(choice).cost, quantity)
          case 3 => total += catalogue(choice).cost * quantity
          case 4 => total += catalogue(choice).cost * quantity
          case 5 => total += catalogue(choice).cost * quantity
          case _ => return println("Error! Please enter a valid option.")
        }
        if (catalogue(choice).premium == true) isPremium = true
        if (catalogue(choice).food == true) foodExists = true
        if (catalogue(choice).hot == true & catalogue(choice).food == true) isHot = true
        println(foodExists, isHot)
        println("Finished(y/n)")
        var finishedOneChar = readLine().toLowerCase
        println(finishedOneChar)
        if (finishedOneChar == "y") {
          println("Do you have a Loyalty card?(y/n)")
          var loyalty = readLine().toLowerCase()
          if (loyalty == "y" & isPremium == false) {
            println("How many stars do you have?")
            val stars = readLine()
            try {
              var integer_transformation = stars.toInt
              if (integer_transformation >= 0) {
                //println(quantity)
              } else {
                return println("Error! Please enter a valid option.")
              }
            } catch {
              case _: NumberFormatException =>
                return println("Error! Please enter a valid integer.")
            }
            var stars_checked = stars.toInt
            if (stars_checked >= 3 & stars_checked <= 8) total = total * (100 - stars_checked * 2.5) / 100
            accumulator(finished = true)
          } else if (loyalty == "n") {
            accumulator(finished = true)
          } else {
            return println("Error! Please enter a valid option.")
          }
        } else if (finishedOneChar == "n") {
          accumulator(finished = false)
        } else {
          return println("Error! Please enter a valid option.")
        }
      }
    }

    accumulator(false)

  }

  takeOrder(false)


}
