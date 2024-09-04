package topics

fun main(){
    // for each
    val gamesValve = listOf("Counter-Strike", "Dota 2", "Team Fortress") //List.of() Java 9 - значения из списка нельзя менять и добавлять новые
    val gamesRiot = mutableListOf("Valorant", "League of Legends") // ArrayList - значения из списка можно менять и добавлять новые

    for(gameValve in gamesValve){
        println(gameValve)
    }

    //while
    var index = 0
    while (index < gamesValve.size) {
        println ("Game at $index is ${gamesValve[index]}")
        index++
    }

    //Диапазоны (как в Python)
    // .. - счет в порядке возрастанния от a до b включительно
    // until - счет в порядке возрастанния от a до b невключительно
    // downTo - счет в порядке убывания от a до b включительно
    // step - шаг счета
    println(7 in 1..10) // true
    for(i in 5 until 10){
        println(i)
    }
    for (i in 25 downTo 19){
        println(i)
    }
    for (i in 100..200 step 10){
        println(i)
    }

}