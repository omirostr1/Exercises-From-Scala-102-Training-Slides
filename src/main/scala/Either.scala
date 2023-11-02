object Either extends App{

  def getIntAndAdd1(s: String): Either[String, Int] = {
    try {
      Right(s.toInt)
    } catch {
      case e: Exception => Left("Failed")
    }
  }

  println(getIntAndAdd1("Vlospa"))
  println(getIntAndAdd1("3"))

  println(getIntAndAdd1("12").right.map(num => num + 1))
  println(getIntAndAdd1("fail").left.map(word => word.toUpperCase))
  println(getIntAndAdd1("hello").right.map(num => num + 1))

  getIntAndAdd1("12") match {
    case Left(_) => println("We have a Left")
    case Right(_) => println("We have a Right")
  }


}
