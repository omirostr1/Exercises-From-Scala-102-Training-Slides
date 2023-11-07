object MapFunction extends App{

  println(List(1,2,3).map(number => number * 2))
  println(List(1,2,3).map(_ * 2))
  println(List(1, 2, 3).map {
    case 1 => 10
    case x => x * 2
  }
  )
  println(Map("myKey" -> "myValue").map { case (key, value) =>
    s"key: $key, value: $value"
  }
  )

  println(Map("myKey" -> "myValue").map { case (key, value) =>
    "myValue" -> key
  }
  )

  println(List(1,2,3).map(x => List(x * 2, x * 4, x* 6)))

  val list1 = List(1,2,3).map(x => List(x*2, x*4, x*6)).flatten
  println(list1)

  println(List(1,2,3).flatMap(x => List(x*2, x*4, x*6)))

  val list2 = List(1, 2, 3).flatMap {
    case x@(1 | 3) => Some(x * 2)
    case _ => None
  }
  println(list2)

  println(Some(3).map(number => number * 3))

  val list3 = Some(3).map {
    case 1 => 10
    case x => x * 2
  }
  println(list3)

  println(Option.empty[Int].map(number => number * 3))

  println(Some(3).flatMap(x => if(x == 3) Some(9) else None))

  println(Some(2).flatMap(x => if(x == 3) Some(9) else None))

  println(Option.empty[Int].flatMap(x => if(x == 3) Some(9) else None))

  println(Right[String, Int](3).map(number => number * 3))

  val list4 = Right[String, Int](1).map {
    case 1 => 10
    case x => x * 2
  }
  println(list4)

  println(Left[String, Int]("Hi").map(number => number * 3))


}
