import scala.collection.mutable.ArrayBuffer

/**
  * Created by leon on 16/8/16.
  */
object ScalaArray {
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
  b += (1, 2, 3, 5) //arrayBuffer(1, 1, 2, 3, 5)
  //++= 追加集合
  b ++= Array(4, 2, 1)
  //移除最后3个元素
  b.trimEnd(3)
  //数组缓冲
  //  b.toArray()

  //遍历
  for (elem <- b)
    print(elem)

  //数组转换
  val a1 = Array(2, 3, 4)
  val b1 = for (elem <- a1) yield 2 * elem //(4, 6, 8)
  //guard 丢掉奇数元素
  var b2 = for (elem <- a1 if elem % 2 == 0) yield 2 * elem
  b2 = a1.filter(_ % 2 == 0).map(2 * _)




}
