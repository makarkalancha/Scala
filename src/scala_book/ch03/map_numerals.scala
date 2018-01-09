/**
 * User: Makar Kalancha
 * Date: 09/01/2015
 * Time: 13:45
 */
val romanNumeral = Map(
  1->"I",
  2->"II",
  3->"III",
  4->"IV",
  5->"V"
)
println(romanNumeral)
println(romanNumeral(4))

//Map is immutable by default
romanNumeral.+(6->"VI")
println(romanNumeral)
val romanNumeral1 = romanNumeral.+(6->"VI")
println(romanNumeral1)

romanNumeral += (7->"VII")
//romanNumeral.+(7->"VII")
//romanNumeral = romanNumeral.+(7->"VII")
println(romanNumeral)

