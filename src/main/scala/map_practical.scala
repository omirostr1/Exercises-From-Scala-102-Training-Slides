object map_practical extends App{

  def macbookLover(laptop: String): String = {
    val character_list = laptop.toList
    character_list.map(character => character.toUpper).mkString  + " ARE THE BEST"
  }

  println(macbookLover("macbook"))


  def sumOfContents(list: List[String]) : Int = {
    val list1 = list.map(_.toInt)
    list1.map(int => int * 2)
    list1.sum
  }

  println(sumOfContents(List("1", "2", "3")))

}
