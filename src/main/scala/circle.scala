object circle extends App{

  val pi: Double = 3.14

  def area(radius: Double) : Double = {
    pi * scala.math.pow(radius, 2)
  }

  println(area(3))

  def circumference(radius: Double) : Double = {
    2 * pi * radius
  }

  println(circumference(3))

  def circle_calculations(func:(Double) => Double, radius: Double) : Double = func(radius)

  println(circle_calculations(area,(3)))
  println(circle_calculations(circumference,(3)))

}
