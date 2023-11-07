object flatMap_function extends App{

  println(Right[String, Int](3).flatMap(x => if(x == 3) Right[String, Int](9) else Left[String, Int]("false")))
  val flatMap1 = Right[String, Int](2).flatMap(x => if(x == 3) Right[String, Int](9) else Left[String, Int]("false"))
  val flatMap2 = Left[String, Int]("Hi").flatMap(x => if(x == 3) Right[String, Int](9) else Left[String, Int]("false"))

  println(flatMap1)
  println(flatMap2)


}
