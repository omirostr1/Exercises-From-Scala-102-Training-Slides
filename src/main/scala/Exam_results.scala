object Exam_results extends  App{

  def multiply_by_12(input: Option[Int]) : Int = {
    input match {
      case Some(input) => 12 * input
      case None => 12
    }
  }

  println(multiply_by_12(Some(12)))
  println(multiply_by_12(None))
  println(multiply_by_12(Some(2)))

  val scores = Seq(None, Some("A"), Some("B"), Some("C"), None, Some("F"))
  println(scores.flatten)
  val allPass = Seq(None, Some("A"), Some("B"), Some("C"), None, Some("F")).map{
    case None => "F"
    case Some(x) => x
  }
  println(allPass)


}
