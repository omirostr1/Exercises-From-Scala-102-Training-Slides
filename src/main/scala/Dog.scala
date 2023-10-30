object Dog extends App{

  sealed trait Animal {
    val name: String
    val breed: String
    val age: Int
  }

  case class Dog (name: String, breed: String, age: Int) extends Animal
  case class Cat (name: String, breed: String, age: Int) extends Animal
  case class Bird (name: String, breed: String, age: Int) extends Animal

  val instance1 = Dog("Bobby", "Cocker Spaniel", 3)
  val instance2 = Dog("Kenny", "Lambrador", 2)
  val instance3 = Dog("Penny", "Golden Retriever", 5)
  val instance4 = Dog("Ruby", "Chihuahua", 1)
  val instance5 = Cat("Princess", "Siamese", 2)
  val instance6 = Cat("Fluffy", "Sphynx", 5)
  val instance7 = Cat("Tom", "Persian", 9)
  val instance8 = Bird("Josh", "Mockingbird", 3)
  val instance9 = Bird("Jerry", "Parrot", 1)
  val instance10 = Bird("Speed", "Lovebird", 8)

  case class Kennel (name: String, list: List[Animal])

  val kennelInstance = Kennel("HomeForAll", List(instance1, instance2, instance3, instance4
    ,instance5, instance6, instance7, instance8, instance9, instance10))

  println(instance1)
  println(instance2)
  println(instance3)
  println(instance4)
  println(kennelInstance)

  val changedName = kennelInstance.copy(name = "Home4All")



  println(changedName)

}
