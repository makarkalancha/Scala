/**
 * User: Makar Kalancha
 * Date: 09/01/2015
 * Time: 14:18
 */

class FancyGreeter(greeting: String){
  def greet()=println(greeting)
}

val g = new FancyGreeter("hello, bitch!")
g.greet()
