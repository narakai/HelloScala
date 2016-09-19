import scala.collection.mutable.ArrayBuffer

/**
  * Created by leon on 16/8/16.
  */
object ArraySample {
  def main(args: Array[String]) {

  }

  //定长数组
  val nums = new Array[Int](10)
  val a = new Array[String](10)
  val s = Array("Hello", "Array")
  //使用()来访问元素
  s(0) = "Goodbye"

  //变长数组
  val b = ArrayBuffer[Int]()
  //+= 在尾端添加元素
  b += 1
  b +=(1, 2, 3, 5) //arrayBuffer(1, 1, 2, 3, 5)
  //++= 追加集合
  b ++= Array(4, 2, 1)
  //移除最后3个元素
  b.trimEnd(3)
  //数组缓冲
  //  b.toArray()

  //遍历
  //  for (elem <- b)
  //    println(elem)

  //数组转换
  val a1 = Array(2, 3, 4, -1)
  val b1 = for (elem <- a1) yield 2 * elem
  //(4, 6, 8)
  //guard 丢掉奇数元素
  var b2 = for (elem <- a1 if elem % 2 == 0) yield {
    2 * elem
  }
  b2 = a1.filter(_ % 2 == 0).map(2 * _)

  //移除除第一个负数外的所有负数
  val testArray = ArrayBuffer(-1, 2, -2, 3, -4, 5)
  var first = true
  //构造新的index数组 -1
  val indexes = for (i <- testArray.indices if first || testArray(i) >= 0) yield {
    if (testArray(i) < 0) first = false
    i
  }
  //构造新的index数组 -2
  //filter传入函数非参数
  var testArray2 = testArray.filter(x => {x > 0 || x == -1}).map(x => {x * 2})
  print(testArray2)

  for (j <- indexes.indices) testArray(j) = testArray(indexes(j))
  testArray.trimEnd(testArray.length - indexes.length)

  val sorted = testArray.sortWith(_ > _)

}
