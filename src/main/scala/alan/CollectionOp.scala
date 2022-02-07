package alan

object CollectionOp extends App {

  // Partition collection
  class People(var age: Int) {
    override def toString: String = s"People(${age})"
  }

  val peoples = Seq(new People(14), new People(11), new People(21), new People(33), new People(44))
  /*
   * Check if collection is not empty
   */
  if (peoples.nonEmpty)
    println("peoples=" + peoples)
  /*
   * Partition - split the collection into sub-collection
   */
  val (minors, adults) = peoples partition (_.age < 18)
  println("minors " + minors)

  /*
   * Get element from collection head(), last(), find()
   */
  // Get first element of the collection (be careful using with un-order collection)
  val people1 = peoples.head
  println("peoples.head=" + people1)

  // Get last element of the collection (be careful using with un-order collection)
  val people4 = peoples.last
  println("peoples.last=" + people4)

  // using find() to find an element in the List
  val listNum = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
  val num5: Option[Int] = listNum.find(n => n == 5)
  println("list find 5=" + num5)
  println("list find 5 if sure not None=" + num5.get)
  if (num5 != None)
    println("list find 5 using get=" + num5.get)
  else
    println("list find 5 None=" + None)

  /*
   * Test collection with a given predicate exists()
   */
  // using exists() return boolean
  val num3 = listNum.exists(n => n==3)
  println("list exists 3=" + num3)
  // another syntax using exists with posfix/infix notation
  val num2 = listNum exists (_==22)
  println("list exists 22=" + num2)

  // Using filter() to get list of elements matching, return collection
  val num4 = listNum.filter(n => n>=8)
  println("list filter4=" + num4)
}