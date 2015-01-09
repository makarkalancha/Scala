import scala.collection.mutable.HashSet
import scala.collection.mutable.HashMap
//import scala.collection.immutable.HashMap

/**
* User: Makar Kalancha
* Date: 09/01/2015
* Time: 12:51
*/
println("-----------Sets")
val jetSet = new HashSet[String]
jetSet+="Lear"
jetSet+=("Boeing","Airbus")
println(jetSet)

println(jetSet.contains("Cessna"))


//immutable
//val movieSet = Set("Hitch","Poltergeist","Shrek")
//println(movieSet)

println("-----------Maps")
val treasureMap = new HashMap[Int, String]
treasureMap += (1->"Go to island.")
treasureMap += (2->"Find big X on ground.")
treasureMap += (3->"Dig.")
println(treasureMap)
println(treasureMap(2))
