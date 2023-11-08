object enumeration_practical extends App{

  object Animals extends Enumeration {
    val Cat, Dog, Zebra, Mouse, Crow, Ant, Bee, Fly, Mosquito, Giraffe = Value
  }

  println(Animals.values)
  println(Animals.values.toList)

  sealed trait Animals1

  case object Cat extends Animals1
  case object Dog extends Animals1
  case object Zebra extends Animals1
  case object Mouse extends Animals1
  case object Crow extends Animals1
  case object Ant extends Animals1
  case object Bee extends Animals1
  case object Fly extends Animals1
  case object Mosquito extends Animals1
  case object Giraffe extends Animals1

  val list: List[Animals1] = List(Cat, Dog, Zebra, Mouse, Crow, Ant, Bee, Fly, Mosquito, Giraffe)

  println(list)
  list.foreach(x => println(x.toString))

  case object TypeOfAnimalEnum extends Enumeration {
    val Reptile, Bird, Mammal = Value
  }

  case object CanFlyEnum extends Enumeration {
    val Yes, No, SortOf = Value
  }

  case object ColourEnum extends Enumeration {
    val Brown, Black, White, Grey, Other, Mixture = Value
  }


  sealed trait TypeOfAnimalEnum

  case object Reptile extends TypeOfAnimalEnum
  case object Bird extends TypeOfAnimalEnum
  case object Mammal extends TypeOfAnimalEnum

  sealed trait CanFlyEnum

  case object Yes extends CanFlyEnum
  case object No extends CanFlyEnum
  case object SortOf extends CanFlyEnum

  sealed trait ColourEnum

  case object Brown extends ColourEnum
  case object Black extends ColourEnum
  case object White extends ColourEnum
  case object Grey extends ColourEnum
  case object Other extends ColourEnum
  case object Mixture extends ColourEnum

  sealed trait AnimalCaseClass

  case object Crocodile extends AnimalCaseClass

//  val crocodile = AnimalCaseClass("Crok", TypeOfAnimalEnum.Reptile, CanFlyEnum.No)
//  crocodile match {
//    case something => println("I’m a reptile")
//  }


}
