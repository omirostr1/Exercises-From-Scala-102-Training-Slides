import java.util.Date

object Strings_Interpolation_Practical_2 extends App{

  val weird_string: String = "\n\n\n\n\n\n\n\nsameline\n\n"
  val resultString = s"${weird_string.replaceAll("\n", "")}"
  println(resultString)

  case class Person(name: String, age: Int, sex: String, nationality: String, address: String)

  val instance1 = Person("Omiros", 23, "male", "cypriot", "Flat 128")

  println(s"Name: ${instance1.name}\nAge: ${instance1.age}\nSex: ${instance1.sex}\nNationality: ${instance1.nationality}\nAddress: ${instance1.address} ")

}
