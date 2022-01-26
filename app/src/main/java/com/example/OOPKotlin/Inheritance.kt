package com.example.OOPKotlin

import javax.security.auth.Subject

open class Person(val name: String, val email: String){
    fun info(){
        println("name : $name \nEmail : $email")
    }
}

open class Teacher(name: String, email: String, val subject: String) : Person(name, email) {
    fun specialSubject(){
        info()
        println("Is a teacher who teachs subject $subject")
    }
}

class PrivateTeacher(name: String, email: String, subject: String, val students: Int)
    : Teacher(name, email, subject){

        fun capacity(){
            specialSubject()
            println("As s private teacher able to teach $students students.")
        }
    }

class PublicTeacher(name: String, email: String, subject: String, val school: String)
    :Teacher(name, email, subject){
        fun school(){
            specialSubject()
            println("Teaching at $school as a public teacher")
        }
    }

fun main() {
    val myTeacher = PrivateTeacher("Abdi", "abdirabbani59@gmail.com", "Android programmin", 5)
    myTeacher.capacity()

    println()

    val myHomeRoom = PublicTeacher("Abdi", "abdirabbani59@gmail.com", "Android programmin", "SMK" +
            " IDN Boarding Shool")
    myHomeRoom.school()

    println()
}

