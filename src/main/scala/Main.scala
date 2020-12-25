// @see: https://docs.scala-lang.org/ja/tour/basics.html

val x: Int = 1 + 1

// println({
//   val y = x + 2;
//   y
// })

val sum = (x: Int, y: Int) => x + y
// println(sum(1,2))

var getConstValue = () => 1

// print(getConstValue())

def sumByMethod(x: Int, y: Int): Int = x + y;

// println(sumByMethod(1,2))

def sumByMult(x: Int, y: Int)(z: Int): Int = x + y + z

// println(sumByMult(1,2)(3))

def water(): String = "water"

// println(water())

def vv(x: Int, y: Int): Int = {
  x + y
}

// println(vv(1,2))

class Greet(prefix: String, suffix: String) {
  def greet(name: String):Unit = println(prefix + name + suffix)
}

// val g = new Greet("Hello", "!")
// g.greet(", World");

case class Point(x: Int, y: Int)
val point = Point(1, 2)
val anotherPoint = Point(2, 2)

// println(point == anotherPoint)

object IdFactory {
  private var counter: Int = 0;
  def create(): Int = {
    counter += 1
    counter
  }
}

val c = IdFactory.create();
val d = IdFactory.create();
// println(d);

trait Greeter {
  def greet(name: String): Unit = println("Hello, " + name + "!")
}

class A extends Greeter
class B(prefix: String, suffix: String) extends Greeter {
  override def greet(name: String): Unit = {
    println("Hello, " + prefix + name + suffix + "!")
  }
}

val a = new A();
val b = new B("Prefix", "Sufix");
// a.greet("name");
// b.greet("name");

