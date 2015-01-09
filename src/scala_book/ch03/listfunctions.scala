/**
 * User: Makar Kalancha
 * Date: 09/01/2015
 * Time: 10:32
 */

println("--------initialisation")
val emptyListNil = Nil
println(emptyListNil)

val emptyList = List()
println(emptyList)

val nonEmptyList = List("Cool","tools","rule")
println(nonEmptyList)

val thrill = "Will"::"fill"::"until"::Nil
println(thrill)

println(List("a","b"):::List("c","d"))

println("--------operations")
println(thrill)
val subList1 = thrill(2)
println("thrill(2):"+subList1)

val subList2 = thrill.count(s => s.length ==4)
println("count:"+subList2)

val subList3 = thrill.drop(2)
println("drop:"+subList3)

println("dropRight:"+thrill.dropRight(2))

println("exists:"+thrill.exists(s => s=="until"))
println("exists:"+thrill.exists(s => s.endsWith("l")))

println("filter:"+thrill.filter(s => s.length==4))

println("forall:"+thrill.forall(s => s.endsWith("l")))
println("forall:"+thrill.forall(s => s=="until"))
//println("forall:" + thrill.forall(print))

println("foreach:"+thrill.foreach(s => print(s)))
println("foreach:"+ thrill.foreach(print))

println("head:"+thrill.head)

println("init:"+thrill.init)

println("tail:"+thrill.tail)

println("isEmpty:"+thrill.isEmpty)

println("last:"+thrill.last)

println("length:"+thrill.length)

println("map:"+thrill.map(s => s+"y"))

//http://stackoverflow.com/questions/14947273/scala-remove-not-working
//List had a remove method in earlier versions, but it has been deprecated in 2.8 and removed in 2.9. Use filterNot instead.
//println("remove:"+thrill.remove(s => s.length ==4))
println("filterNot:"+thrill.filterNot(s => s.length ==4))

println("reverse:"+thrill.reverse)

//http://stackoverflow.com/questions/15546828/scala-error-value-sort-is-not-a-member-of-list
//SimplyScala wasn't updated for a long long time: .sort was deprecated in 2.8.0 and cut out in latter versions. Instead you have to use sortWith method.
//println("sort:"+thrill.sort((s,t) => s.charAt(0).toLowerCase < t.charAt(0).toLowerCase))
println("sortWith:"+thrill.sortWith((s,t) => s.charAt(0).toLower < t.charAt(0).toLower))

