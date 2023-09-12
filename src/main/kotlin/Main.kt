//1 zadanie
fun printFullName(firstName: String, lastName: String) {
   println("$firstName $lastName")
}

fun main(args: Array<String>) {
   printFullName("Roman", "Zinchenko")//1 zadanie
   val fullName = calculateFullName("Roman", "Zinchenko") //3 zadanie

   val (fullName1, fullNameLength) = calculateFullName1("Roman", "Zinchenko")
   println("Полное имя: $fullName1")
   println("Длина: $fullNameLength")//4 zadanie

}
//3 zadanie
fun calculateFullName (firstName: String, lastName: String): String {
   return "$firstName $lastName" }

//4 zadanie
fun calculateFullName1 (firstName: String, lastName: String): Pair<String, Int> {
   val fullName1 = "$firstName $lastName"
   return Pair(fullName1, fullName1.length)

}

