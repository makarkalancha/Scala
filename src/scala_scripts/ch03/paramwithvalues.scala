/**
 * User: Makar Kalancha
 * Date: 08/01/2015
 * Time: 13:12
 */
val greetString = new Array[String](3)

//greetString(0) = "Hello"
//greetString(1) = ", "
//greetString(2) = "me!\n"
//
////for(i <- 0 to 2){
//for(i <- (0).to(2)){
//  print(greetString(i))
//}


greetString.update(0,"Hello")
greetString.update(1, ", ")
greetString.update(2, "me!\n")

//for(i <- 0 to 2){
for(i <- (0).to(2)){
  print(greetString.apply(i))
}
