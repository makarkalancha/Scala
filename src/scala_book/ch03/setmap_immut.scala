/**
 * User: Makar Kalancha
 * Date: 09/01/2015
 * Time: 13:20
 */

import scala.collection.immutable.HashSet
import scala.collection.immutable.HashMap
//import scala.collection.immutable.HashMap

println("-----------Sets")
val jetSet = new HashSet[String]
//unsupported operation
//jetSet+="Lear"
//jetSet+=("Boeing","Airbus")
val jetSet1 = jetSet.+("Lear", "Boeing", "Airbus")

println(jetSet)
println(jetSet1)

println(jetSet.contains("Cessna"))


println("-----------Maps")
val treasureMap = new HashMap[Int, String]
//unsupported operation
//treasureMap += (1->"Go to island.")
//treasureMap += (2->"Find big X on ground.")
//treasureMap += (3->"Dig.")
val treasureMap1 = treasureMap.+(1 -> "Go to island.", 2 -> "Find big X on ground.", 3 -> "Dig.")
println(treasureMap)
//println(treasureMap(2)) //error java.util.NoSuchElementException: key not found: 2
println(treasureMap1)
println(treasureMap1(2))

