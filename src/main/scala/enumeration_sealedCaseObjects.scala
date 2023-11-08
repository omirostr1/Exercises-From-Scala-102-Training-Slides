import enumeration.Weekday

object enumeration_sealedCaseObjects extends App{

  sealed trait Weekdayz

  case object Monday extends Weekdayz

  case object Tuesday extends Weekdayz

  case object Wednesday extends Weekdayz

  case object Thursday extends Weekdayz

  case object Friday extends Weekdayz

  case object Saturday extends Weekdayz

  case object Sunday extends Weekdayz

  def test(weekday: Weekdayz): Unit = {
    weekday match {
      case Monday => println("I hate Mondays")
      case Sunday => println("The weekend is already over? :( ")
    }
  }

  test(Monday)
  test(Sunday)
  //test(Tuesday) //Produces an error, no such case exists.\

  abstract class error(val status: String, val message: String)

  case object InternalServer extends error("SERVER_ERROR", "An internal server error occurred")
  case object NotFound extends error("NOT_FOUND", "Matching resource was not found")

  abstract class Error(val status: String, val message: String, val order: Int) {
    def compare(that: Error) = this.order - that.order
  }

  case object InternalServer1 extends Error("SERVER_ERROR", "An internal server error occurred", 0)
  case object NotFound1 extends Error("NOT_FOUND", "Matching resource was not found", 1)



}
