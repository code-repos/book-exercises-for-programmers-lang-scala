import scala.io.StdIn

object SayingHello {

  def main(args: Array[String])
  {
    println("What is your name?")
    val name = StdIn.readLine()
    val greeting = s"Hello, $name, nice to meet you!"
    println(greeting)
  }
}
