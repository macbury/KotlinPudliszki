/**
 * Created by macbury on 06.07.17.
 */

class HelloWorld(val name : String) {
  fun speak(): HelloWorld {
    println("O my! $name hello!")
    return this
  }
  
  fun range() {
    for (a in 0..20) {
      println(a)
    }
  }
}

fun main(args : Array<String>) {
  HelloWorld("Volvering").speak().range()
}