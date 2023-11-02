object default_parameters extends App{

  def greeting(greeting: String = "Hi",
               name: String = "Mac",
               punctuation: String = "!"): String = {
    greeting + " " + name + punctuation
  }

  val a = greeting("Hi", "Mac", "!") // "Hi Mac!"
  val b = greeting() // "Hi Mac!"
  val c = greeting("Hello") // "Hello Mac!"
  val d = greeting("Mornin", "Angle") // "Mornin Angle!"
  val e = greeting(",") // ", Mac!"
  val f = greeting(punctuation = ",") 	// "Hi Mac,"


  println(a)
  println(b)
  println(c)
  println(d)
  println(e)
  println(f)

}
