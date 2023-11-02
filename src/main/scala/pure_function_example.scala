object pure_function_example extends App{

  val sentence: String = ""

  def append(sentence: String, word: String): String =
    sentence + " " + word.trim()

  val a = append(sentence, "Allo") // "Allo"
  val b = append(sentence, "Allo") // "Allo"

  println(a)
  println(b)

}
