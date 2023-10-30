object Notification extends App{

  abstract class Notification

  case class Email(sender:String, title:String, body: String) extends Notification
  case class SMS(caller:String, message:String) extends Notification
  case class VoiceRecording(contactName:String, link:String) extends Notification

  val notification: Notification = SMS("12345", "Are you there?")

  notification match {
    case Email(email,title, _) => "Email from " + email + "with title: " + title
    case SMS(number, message) => "SMS from " + number + "! Message: " + message
    case VoiceRecording(name, link) => "Voice Recording from" + name + "-" + link
  }

}
