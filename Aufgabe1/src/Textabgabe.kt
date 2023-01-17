// Teilaufgabe a) 15
// Teilaufgabe b) Gelb
// Teilaufgabe c) 60

/*
fun subtrahieren(): Int {
    var zahl1 = 28
    var zahl2 = 13
    return zahl1 - zahl2
}


fun main() {ㅤㅤ
    println(subtrahieren())
}
*/


/*
fun lieblingsFarbe(): String {
    val farben: List<String> = listOf("Rot", "Blau", "Gelb", "Grün", "Lila", "Pink")
    var meineFarbe: String = farben[farben.size-4]
    return meineFarbe
}

fun main() {
    println(lieblingsFarbe())
}

 */

fun ersteZahl(): Int {
    return (20 - 18) * 6
}

fun zweiteZahl(): Int {
    return 25 / 5
}

fun main() {
    val ergebnis = ersteZahl() * zweiteZahl()
    println(ergebnis)
}
