package com.example.mod3lib

import java.util.Scanner

class Test

//open permet de faire hériter la class
open class Personne{

    private var firstname : String = ""
    private var lastname : String = ""

    constructor(firstname : String){
        this.firstname = firstname
    }
    constructor(firstname: String, lastname :String){
        this.firstname = firstname
        this.lastname = lastname
    }

    fun getFirstname() : String{
        return this.firstname
    }


    open fun getTruc(){
        println("Truc")
    }

    override fun toString(): String {
        return this.firstname + " " + this.lastname
    }
}
fun Test.addFun(){
    println("j'ai ajouté du fun !")
}

data class Personne2(var firstname: String, var lastname: String)

class Enfant : Personne{
    var age : Int = 0
   constructor(age : Int, firstname: String,  lastname: String) : super(firstname, lastname) {
       this.age = age
   }
    override fun toString(): String {
        return super.toString() + ", age = " + this.age
    }

    override fun getTruc() {
        super.getTruc()
        println(" dans la class enfant")
    }
}


fun main() {
    val test = Test()
    test.addFun()

    var p : Personne = Personne("Luigi", "Mario")
    p.getTruc()
    println(p.getFirstname())
    println("----------------------")

    var p2 : Personne2 = Personne2("Daisy", "Mario")

    p2.firstname = "Peach"
    p2.lastname = "truc" //si val ne peut pas être mis à jour !
    println(p2.firstname)
    println(p2.toString())

    println("----------------------")
    var e = Enfant(12, "Toad", "Champi")
    println(e.toString())
    e.getTruc()

    //scan en mode java
    val scan = Scanner(System.`in`)
    println("ici c'est la saisie")
    //scan en mode kotlin
    var result = readLine()
    print(result)
}