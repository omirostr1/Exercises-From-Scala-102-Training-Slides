import scala.util.Random

object quotes extends App{

  val spongebobQuotes : Option[String] => String = {
    case Some("Spongbob") => "F is for friends who do stuff together!"
    case Some("Patrick") => "Is this the Krusty Krab? No, this is Patrick"
    case Some("Squidward") => "Wake me up when I care."
    case Some("Mr. Krabs") => "Hmmm, a five-letter word for happiness...money."
    case Some("Plankton") => "Goodbye everyone, I'll remember you all in therapy."
    case _ => "Default quote because no character found."
  }



  val philosophyQuotes : Option[String] => String ={
    case Some(quote) => quote
    case None =>
      val quotes: List[String] = List("The unexamined life is not worth living", "Whereof one cannot speak, thereof one must be silent","Entities should not be multiplied unnecessarily", "I think therefore I am", "We live in the best of all possible worlds")
      val rand = new Random
      quotes(rand.nextInt(quotes.length))
  }

  val HOF: ((Option[String]) => String, Option[String]) => String = (func, quote) => {
    func(quote)
  }

  println(spongebobQuotes(Some("Omiros")))
  println(spongebobQuotes(Some("Patrick")))
  println(philosophyQuotes(None))
  println(philosophyQuotes(Some("One cannot step twice in the same river")))
  println(HOF(spongebobQuotes,Some("Omiros")))
  println(HOF(spongebobQuotes,Some("Patrick")))
  println(HOF(philosophyQuotes,None))
  println(HOF(philosophyQuotes,Some("One cannot step twice in the same river")))


}
