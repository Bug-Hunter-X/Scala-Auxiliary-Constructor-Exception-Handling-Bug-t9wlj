```scala
class MyClass(val value: Int) {
  def this(str: String) = this(str.toInt)
}

val instance1 = new MyClass(10)
val instance2 = new MyClass("20")

println(instance1.value) // Output: 10
println(instance2.value) // Output: 20

// Incorrect way to handle an exception during type conversion 
// which can throw an exception if the input string cannot be converted to an integer
class MyClass2(val value: Int) {
  def this(str: String) = {
    try {
      this(str.toInt)
    } catch {
      case e: NumberFormatException => this(0) // default value 
    }
  }
}

val instance3 = new MyClass2("30")
val instance4 = new MyClass2("abc")

println(instance3.value) // Output: 30
println(instance4.value) //Output: 0
```