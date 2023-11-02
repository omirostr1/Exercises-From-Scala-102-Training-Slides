object animal_exercise extends App{

  abstract class Animal(val name: String, val age: Int)

  case class Dog(override val name: String, override val age: Int) extends Animal(name, age)

  case class Cat(override val name: String, override val age: Int) extends Animal(name, age)

  def animalTypeCheck(animal: Animal): String = {
    animal match {
      case dog: Dog => "Dog"
      case cat: Cat => "Kitty"
      case _ => "Other"
    }
  }

  def animalNameCheck(animal: Animal): Unit = {
    animal.name match {
      case "Sam" => println(s"Sam's age is: ${animal.age}")
      case _ => println(s"${animal.name} is not Sam")
    }
  }

  def animalAgeCheck(animal: Animal): Unit = {
    animal.age match {
      case age if (animal.age > 10) => println(s"${animal.name} is ${animal.age} years old.")
      case _ => println(s"${animal.name} is young")
    }
  }

  println(animalTypeCheck(Dog("max", 3)))
  println(animalTypeCheck(Cat("shorty", 1)))
  animalNameCheck(Cat("Sam", 10))
  animalNameCheck(Dog("Penny", 4))
  animalAgeCheck(Cat("Sam", 10))
  animalAgeCheck(Dog("Max", 5))
  animalAgeCheck(Cat("Max", 13))

}
