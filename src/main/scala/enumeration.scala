object enumeration extends App{

  object Weekday extends Enumeration {
    val Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday = Value
  }

  println(Weekday.Monday.toString)
  println(Weekday.withName("Monday"))
  //println(Weekday.withName("Mondai")) // It produces an error.

  object Weekdays extends Enumeration {

    val Monday = Value("Mon")
    val Tuesday = Value("Tue")
    val Wednesday = Value("Wed")
    val Thursday = Value("Thur")
    val Friday = Value("Fri")
    val Saturday = Value("Sat")
    val Sunday = Value("Sun")
  }

  println(Weekdays.Monday.toString)
  println(Weekdays.values)
  println(Weekday.values)

  println(Weekdays.Monday < Weekdays.Tuesday)

  println(Weekdays.Sunday > Weekdays.Monday)

  println(Weekdays.Monday == Weekdays.Monday)

  println(Weekdays.Saturday > Weekdays.Sunday)

  object Weekdays1 extends Enumeration {

    val Monday = Value(6)
    val Tuesday = Value(5)
    val Wednesday = Value(4)
    val Thursday = Value(3)
    val Friday = Value(2)
    val Saturday = Value(1)
    val Sunday = Value(0)

  }

  println(Weekdays1.values.toList.sorted)

//  def nonExhaustive(weekday: Weekdays1.Value) {
//    weekday match {
//      case Monday => println("I hate Mondays")
//      case Sunday => println("The weekend is already over? :( ")
//    }
//  }
  // Compiler won’t show that not all values are matched!

  object Weekday2 extends Enumeration {
    val Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday = Value
  }

  object OtherEnum extends Enumeration {
    val A, B, C = Value
  }

 def test(enum: Weekday.Value): Unit = {
    println(s"enum: $enum")
 }

  def test1(enum: OtherEnum.Value): Unit = {
    println(s"enum: $enum")
  }

  test(Weekday.Monday)
  test1(OtherEnum.B)



}
