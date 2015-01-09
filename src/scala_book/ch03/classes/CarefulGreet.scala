/**
 * User: Makar Kalancha
 * Date: 09/01/2015
 * Time: 14:29
 */

class CarefulGreet(greeting: String){
  if (greeting == null) {
    throw new NullPointerException("greeting was null")
  }

  def greet()=println(greeting)
}

val g1 = new CarefulGreet("hello")
g1.greet()

val g2 = new CarefulGreet(null)
g2.greet()