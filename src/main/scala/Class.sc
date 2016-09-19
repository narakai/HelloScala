import java.util.Date

class Counter {
  var value = 0
  //赋值
  def increment() {value += 1}
  //取值
  def current = value

  //getter setter
  def value1 = value
  def value1_=(newValue: Int): Unit = {
    if (newValue > value) value = newValue
  }

  //只读属性
  val timeStamp = new Date()
}

var myCounter = new Counter
myCounter.increment()
println(myCounter.current)
println(myCounter.value)
myCounter.value=21
(1 to 9).map("*" *  _).foreach(println)
(1 to 9).product
"Mary has a little lamp".split(" ").sortWith(_.length < _.length)
def numsFrom(n : BigInt) : Stream[BigInt] = n #:: numsFrom(n + 1)
val tenOrMore = numsFrom(10)
tenOrMore.tail.tail.tail.tail
val squares = numsFrom(1).map(x => x * x)
squares.take(5).force
val powers = (0 until 1000).view.map(1 + _)
powers(100)
for (i <- (0 until 10).par) print(i + " ")

val oneTwo = List(1, 2)
val threeFour = List(3, 4)
val combine = oneTwo ::: threeFour
val combine2 = 1 :: threeFour

def formatArgs(args: Array[String]) = args.mkString("\n")
println(formatArgs(Array("zero", "one", "two")))
