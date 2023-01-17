fun main() {

    println(intenger())            // a
    println(double())              // b
    println(string())              // c
    println(listString())          // d
    println(sprachenBoolean())     // e
    println(nothing())             // f
}

// a
fun intenger(): Int {
    var zahlInt: Int = 5
    return zahlInt
}

// b
fun double(): Double {
    var zahlDouble: Double = 6.234
    return zahlDouble
}

// c
fun string(): String {
    var string: String = "Hallo"
    return string
}

// d
fun listString(): List<String> {
    var begrüßung: List<String> = listOf("Hallo", "Welt", "!")
    return begrüßung
}


// e
fun sprachenBoolean(): MutableMap<String, Boolean> {
    var learnLanguage: MutableMap<String, Boolean> = mutableMapOf(
        "Lernen wir die Sprache Französisch?" to false,
        "Lernen wir die Sprache Kotlin?" to true
    )
    return learnLanguage
}

// f
fun nothing(){}

