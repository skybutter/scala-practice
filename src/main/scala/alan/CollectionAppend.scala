package alan

/**
 * This is a must read for scala collection.
 * https://docs.scala-lang.org/overviews/collections/introduction.html
 * Also see this
 * https://alvinalexander.com/scala/scala-list-class-examples/
 */
object CollectionAppend extends App {

  // Initialize List
  val list21 = List(1,2,3)
  println("Initialize " + list21)
  val list22 = List.range(1,3)    // 1,2 (no 3)
  println("Initialize range " + list22)
  val list23 = List.range(0,7, 2)    // 0, 2, 4, 6
  println("Initialize range " + list23)
  val list24 = List.fill(2)("me")
  println("Initialize fill " + list24)

  val list:List[Int] = List(1, 2, 3, 4, 5)
  println("List class " + list.getClass.getName)
  // List is immutable, so the following operations is creating new List
  // See https://alvinalexander.com/scala/how-add-elements-to-a-list-in-scala-listbuffer-immutable/
  // Prepend element to list (add to beginning) using ::
  val list3 = 7 :: list
  println("Prepend " + list3)
  // Prepend element to list (add to beginning) using +:
  val list2 = 8 +: list
  println("Prepend " + list2)
  // Prepend element to list (add to beginning) using .::
  // https://stackoverflow.com/questions/40554830/what-does-dot-colon-colon-meaning-in-scala
  val list8 = list.::(12)      // using the dot to call the method :: to prepend
  println("Prepend " + list8)
  // Prepend element to list (add to beginning)
  val list5 = List(10) :: list    // adding a List(10) as an element in the List[Integer], probably not what we want
  println("Prepend " + list5)

  // Append element to List (add to end) (append is more expensive then prepend
  // See https://stackoverflow.com/questions/1320139/why-is-appending-to-a-list-bad
  val list1 = list :+ 9
  println("Append " + list1)
  // Append element to List (add to end)
  val list4 = list ::: List(6)
  println("Append " + list4)

  // Concatenate List
  // See https://www.baeldung.com/scala/list-concatenation-operators
  val list6 = List(11) ++ list    // using ++
  println("Concatenate " + list6)
  val list7 = list ::: List(11)    // using ::: (faster than ++)
  println("Concatenate " + list7)
  val list9 = List.concat(list, List(13, 14))
  println("Concatenate " + list9)

  // Sequence
  val seq = Seq(1, 2, 3, 4, 5)
  println("Seq class " + seq.getClass.getName)
  val seq1 = seq ++ Seq(11)    // ::: is not available, only available for List
  println("Concatenate " + seq1)
  // Prepend element to Seq (add to beginning)
  val seq2 = 8 +: seq          // :: is not available
  println("Prepend " + seq2)
  // Append element to Seq
  val seq3 = seq :+ 9
  println("Append " + seq3)

  // Vector
  val vec = Vector(1, 2, 3, 4, 5)
  println("Vector class " + vec.getClass.getName)
  val vec1 = 6 +: vec
  println("Prepend " + vec1)
  val vec2 = Vector(7) ++ vec
  println("Concatenate " + vec2)
  val vec3 = vec :+ 8
  println("Append " + vec3)

  // IndexedSeq
  val idxSeq = IndexedSeq(1, 2, 3, 4, 5)
  println("IndexedSeq class " + idxSeq.getClass.getName)
  val idxSeq1 = 6 +: idxSeq
  println("Prepend " + idxSeq1)
  val idxSeq2 = IndexedSeq(7) ++ idxSeq
  println("Concatenate " + idxSeq2)
  val idxSeq3 = idxSeq :+ 8
  println("Append " + idxSeq3)

  // Mutable Collection
  // See https://alvinalexander.com/scala/make-arraybuffer-class-default-mutable-indexed-sequence-scala-cookbook/
  // ListBuffer (backed by List).  Recommend to use ArrayBuffer if you want to access by index
  // https://alvinalexander.com/scala/how-to-create-mutable-list-in-scala-listbuffer-cookbook/
  import scala.collection.mutable.ListBuffer
  var fruits = new ListBuffer[String]()
  fruits += "Apple"
  fruits += ("Banana", "Orange")  // add multiple elements
  fruits ++= Seq("Pineapple", "Strawberry")  // add multiple elements from Seq
  val list10 = fruits.toList
  println("ListBuffer " + list10)
  // remove element
  fruits -= "Banana"
  println("ListBuffer (remove) " + fruits.toList)
  // remove multiple element
  fruits -= ("Strawberry", "Orange")
  println("ListBuffer (remove multi) " + fruits.toList)
  // remove multiple elements from seq
  fruits --= Seq("Pineapple")
  println("ListBuffer (remove multi) " + fruits.toList)

  // ArrayBuffer
  // https://alvinalexander.com/scala/make-arraybuffer-class-default-mutable-indexed-sequence-scala-cookbook/

}
