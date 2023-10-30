object Strings_Interpolation_Practical_1 extends App{

  val name1: String = "Andrew"
  val name2: String = "Paul"

  println(s"$name1 is older than $name2")

  val age1: Int = 23
  val age2: Int = 21

  val age3: Double = 23.75
  val age4: Double = 21.5

  if ((age1 - age2) > 0) {
    println(s"$name1 is ${age1 - age2} years older than $name2")
  } else if (age1 == age2) {
    println(s"$name1 and $name2 have the same age!")
  } else {
    println(println(s"$name2 is ${age2 - age1} years older than $name1"))
  }

  if ((age3 - age4) > 0) {
    println(f"$name1%s is ${age3 - age4}%.2f years older than $name2")
  } else if (age3 == age4) {
    println(s"$name1 and $name2 have the same age!")
  } else {
    println(println(f"$name2%s is ${age4 - age3}%.2f years older than $name1"))
  }


}
