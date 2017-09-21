package com.github.fi3te.helloscala

class User(val id: String, val name: String, var faveColour: String) {

  override def toString = s"User(id: $id, name: $name, faveColour: $faveColour)"

}
