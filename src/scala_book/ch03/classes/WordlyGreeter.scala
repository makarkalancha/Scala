/**
 * User: Makar Kalancha
 * Date: 09/01/2015
 * Time: 15:05
 */

// WordlyGreeter companion object before class!!!
object WordlyGreeter{
  def worldify(s: String)= s+", world!"
}

//
class WordlyGreeter (greeting: String){
  def greet() {
    val worldlyGreeting = WordlyGreeter.worldify(greeting)
    println(worldlyGreeting)
  }
}

val w = new WordlyGreeter("bebee")
w.greet()