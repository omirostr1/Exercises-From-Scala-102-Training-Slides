object EitherStyle extends  App{

  def parse(s: String): Either[NumberFormatException, Int] =
    if (s.matches("-?[0-9]+")) Right(s.toInt) //checks if it is a positive or negative integer.
    else Left(new NumberFormatException(s"${s} is not a valid integer."))

    println(EitherStyle.parse("23").isRight)
    println(EitherStyle.parse("twenty").isLeft)
    //println(EitherStyle.parse(100).isLeft) returns an error as the function requires a string parameter
    println(EitherStyle.parse(100.toString).isLeft)
    println(EitherStyle.parse("21.5").isRight)


}
