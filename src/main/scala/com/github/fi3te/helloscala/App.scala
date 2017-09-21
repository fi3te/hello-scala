package com.github.fi3te.helloscala

object App {

  def main(args: Array[String]): Unit = {
    println("Hello Scala!")
    printList(List("a", "b", "c"))
    println(factorial(4))
    val user = new User("35", "fiete", "blue")
    user.faveColour = "green"
    println(user)
  }

  def printList(list: List[String]): Unit = {
    for(item <- list) {
      println(item)
    }
  }

  def factorial(x: Long): Long = if(x <= 1) 1 else x * factorial(x - 1)

}
