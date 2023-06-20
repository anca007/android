package com.example.mod3lib

//les basiques
//var hello = "Hello"
//
//fun main() {
//
//    hello = "Bonjour"
//    //inférence de type, le type de ma variable ne peut pas changer
//    hello = 12.toString()
//    println(hello)
//
//    //constante avec déclaration de type
//    val value : Int = 10
//    //value = 45 ne peut pas changer de valeur par la suite
//
//    //lazy
//    var mot = "world !"
//    val message by lazy { "Hello $mot" }
//
//    //quand la variable est initialisée elle garde sa valeur par la suite
//    println(message)
//
//    mot = "man !"
//
//    println(message)
//
//    //gestion null implicite ou explicite
//    var mot2 :String?  = null
//
//    println(mot2!!.length)
//}


//structure de controle
//fun main() {
//
//    //if
//    var age = 1
//
//    var message = if (age == 18) {
//        "majeur !"
//    } else {
//        "mineur !"
//    }
//    println(message)
//
//    when (age){
//        1,2 -> println("C'est un bébé !")
//        in 3..10 -> println("C'est un enfant !")
//        is Int -> println("Ce n'est plus un enfant !")
//        else -> println("C'est autre chose !")
//    }
//
//    when (message){
//        "majeur !", "mineur !" -> println("C'est ok !")
//        in "a".."Z" -> println("Un truc")
//    }
//
//    var pays = arrayOf("Belgique", "Bretagne", "Mexique")
//    pays = pays.plus("Australie")
//
//    println(pays[0])
//    for(p in pays){
//        println(p)
//    }
//
//    for((k, p) in pays.withIndex()){
//        println("$k : $p")
//    }
//
//}

//fonctions , extensions, elvis, prédicat (expression fléchée)

fun main() {

    //extension
    fun String.sayHello(){
        println("Hello $this")
    }

    "sylvain".sayHello()

    fun Int.multiply(number : Int) : Int{
        return this * number
    }

    println(12.multiply(5))

    //Elvis
    var name : String? = null

   // name = "ici"
    val taille = name?.length?:12

    println(taille)

    //list
    val colors = mutableListOf<String>("jaune")
    colors.add("violet")
    colors.add("vert")

    println(colors.toString())

    //liste qui ne peut pas changer
    val colors2 = listOf<String>("rose", "cornflowerblue", "chartreuse")
    //ajout à la liste un élément et renvoie une nouvelle liste
    var colors3 = colors2.plus("noir")

    println(colors2)
    println(colors3)

    //val truc = colors3.filter { it.length > 4 }.forEach { println(it) }
    val truc = colors3.filter { color -> color.length > 4 }.forEach { michel -> println(michel) }
    println(colors3.filter { it.length > 4 }.count())

}
