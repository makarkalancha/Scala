/**
 * User: Makar Kalancha
 * Date: 09/01/2015
 * Time: 14:37
 */

class RepeatGreeter(greeting: String, count : Int){
  def this(greeting: String) = this(greeting,1)

  def greet()={
    for(i <- 1 to count){
      println(greeting)
    }
  }
}

val g1 = new RepeatGreeter("Hello", 3)
g1.greet()

val g2 = new RepeatGreeter("hi")
g2.greet()


