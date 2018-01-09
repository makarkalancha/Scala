import scala.io.Source

/**
 * User: Makar Kalancha
 * Date: 16/01/2015
 * Time: 13:31
 */

if(args.length > 0){
  var i=0;
  for(line <- Source.fromFile(args(0)).getLines()) {
    i+=1
    println("#"+i+"-> "+line.length + " : " + line)
  }
} else {
  Console.err.println("Please enter filename")
}

