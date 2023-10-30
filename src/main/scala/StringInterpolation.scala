object StringInterpolation extends App{

  val name: String = "Billy"
  println("My name is " + name)

  println(s"My name is $name")

  println(s"5 * 5 = ${5 * 5}")

  val number: Int = 10
  println(s"4 * $number=${4 * number}")

}
