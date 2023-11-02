object Chocolates extends App{

  trait Chocolate {
    val colour: String
    val filling: Option[String]
  }

  class Bounty(
    val colour: String, val filling: Option[String]
  ) extends Chocolate

  class DairyMilk(
    val colour: String, val filling: Option[String]
  ) extends Chocolate

  val bounty = new Bounty("brown", None)
  val whiteDairy = new DairyMilk("white", None)
  val darkDairy = new DairyMilk("dark brown", None)
  val carameeel = new DairyMilk("brown", Some("caramel"))

  println(bounty)

  def whatsInTheChoc(chocolate: Chocolate): String = {
    chocolate.filling match {
      case Some("caramel") => "It’s caramel!"
      case Some(other) => "No caramel, but $other"
      case None => "It’s chocolate all the way down!"
    }
  }

  val filledOption: Option[Int] = Some(2)
  val two: Int = filledOption.get
  println(two)

  val emptyOption: Option[Int] = None
  val number: Int = emptyOption.getOrElse(7)
  println(number)


  println(whatsInTheChoc(bounty))
  println(whatsInTheChoc(whiteDairy))
  println(whatsInTheChoc(darkDairy))
  println(whatsInTheChoc(carameeel))

  case class ChocolateBar(colour: String, filling: Option[String])

  def fillingSpecified(chocolate: ChocolateBar) : String = {
    chocolate.filling.getOrElse("It's chocolate all the way down")
  }

  val chocolate1 = ChocolateBar("brown", Some("jam"))
  val chocolate2 = ChocolateBar("brown", None)
  println(fillingSpecified(chocolate1))
  println(fillingSpecified(chocolate2))

}
