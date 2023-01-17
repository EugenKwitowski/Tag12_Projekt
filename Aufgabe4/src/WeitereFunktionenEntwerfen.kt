fun main() {
    begrüßung()
    println(filmAuswahl())
    println("Es bleiben noch folgende Filme zur Auswahl übrig: ${filmeAusverkauft()}")


}


fun filmAuswahl(): String {
    var wunschFilm = readln().toInt()

    var indexWunschFilm = wunschFilm
    var ausgewählterFilm = videothek()[indexWunschFilm]
    return ausgewählterFilm
        
}


fun videothek(): MutableList<String> {
    var filme: MutableList<String> = mutableListOf("Star Wars", "Shrek", "Toy Story")
    return filme
}

fun filmeAusverkauft(): MutableList<String> {
    var filmeÜbrig = videothek()
    filmeÜbrig.remove(filmAuswahl())
    return filmeÜbrig
}

fun begrüßung() {

    println("Herzlich willkommen in unserer City Videothek!")
    println("Wir haben die neueste Filme. Dies sind ${videothek()}")
    println("Welchen Film möchten sie schauen?")
    println("Wählen sie zwischen 0 und 2")

}