/**
 * User: Makar Kalancha
 * Date: 08/01/2015
 * Time: 15:49
 */
val twoThree= List(2, 3)
val oneTwoThree = 1 :: twoThree
println(oneTwoThree)

println(twoThree)

//val twoThreeOne = twoThree :: 1
val one = List(1)
val twoThreeOne = twoThree ::: one
println(twoThreeOne)

val oneTwoThree1 = 1::2::3::Nil
println(oneTwoThree1)