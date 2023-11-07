object either_practical extends App{

  def eitherCheck(username: String, password: String) : Either[String, Boolean] = {
    userExists(username, password) match {
      case true => Right(userExists(username, password))
      case false => Left("UserNotFoundError")
    }
  }

  def userExists(username: String, password: String): Boolean = {
    (username, password) match {
      case ("Borris Johnson", "pword123") => true
      case ("Barack Obama", "merica") => true
      case _ => false
    }
  }

  println(eitherCheck("Borris Johnson", "pword123"))
  println(eitherCheck("Borris Johnson", "psdddword123"))

}
