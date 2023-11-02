object impure_function_example extends App{

  var sentence: String = ""

  def append(word: String): String = {
    sentence = sentence + " " + word
    sentence.trim()
  }

  val a = append("Allo") // "Allo"
  val b = append("Allo") // "Allo Allo"

  println(a)
  println(b)

}
