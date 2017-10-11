package example.brain.modules

import scala.bot.learn.Learner

trait Greeting extends Learner {
  val greetings: Templates = learn(Map[(Option[String], String), List[String]]().empty,
    Map[(Option[String], String), List[String]](
      (None, "Hi") -> List( "Hello", "What's up", "Im a bot"),
      (None, "Test") -> List("How old are you?"),
      (None, "Greetings") -> List("Greetings", "Hello", "Sup")
    ))
}