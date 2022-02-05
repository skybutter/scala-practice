package alan

object VariableArguments {

  def main(args: Array[String]): Unit = {
    // Passing a number of strings into the method
    variableArguments("Hello", "World")
    // Using a list to pass into the method
    val list = List("using", "list")
    variableArguments(list:_*)
    // Using an array to pass into the method
    val arr = Array("using", "array")
    variableArguments(arr:_*)
    // Using a Seq to pass into the method
    val seq = Seq("using", "seq")
    variableArguments(seq:_*)
  }
  /**
   * Method with variable arguments (varargs).  This allows caller to pass variable length arguments to the method.
   * The * after the type String declare it as variable arguments
   * The argument is a Array[String] inside the method
    * @param field
   */
  def variableArguments(fields: String*) : Unit = {
    println("class: " + fields.getClass)
    println("length:" + fields.length)
    println("size:" + fields.size)
    for (f <- fields) {
      print(f + " ")
    }
    println()
  }
}
