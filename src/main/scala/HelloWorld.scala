import java.net.URL
import java.nio.charset.MalformedInputException
import java.text.MessageFormat

/**
  * Created by leon on 16/8/10.
  */

object HelloWorld {
  def main(args: Array[String]) {
    //    println(sumMutable)
    //    print(decorate("hello"))
    //    print(sum(1, 3, 5))

    //传入序列
    val s = sum(1 to 5: _*)
    //    print(s)
    print(box("hello"))

  }

  //常量变量
  def sumMutable() = {
    val unMutableNUmber = 100
    var mutableNUmber = 8 * 5 + 4
    mutableNUmber += 1
    (mutableNUmber + unMutableNUmber).to(160)
  }

  //循环
  for (c <- "Hello"; i <- 0 to 1) yield (c + i).toChar
  //范围0到s.length-1
  val s = ""
  for (i <- 0 until s.length) print(i + ": " + s(i))

  //函数
  def decorate(str: String, left: String = "[", right: String = "]") = {
    left + str + right
  }

  //变长参数
  def sum(args: Int*) = {
    var result = 0
    for (arg <- args) result += arg
    result
  }

  //递归 head-首元素 tail-其他元素的序列 递归要注明返回类型
  def recursiveSum(args: Int*): Int = {
    if (args.isEmpty) 0
    else args.head + recursiveSum(args.tail: _*)
  }

  //调用变长参数且参数类型为Object的java方法,需手动对参数类型进行转换 Object... args
  val str = MessageFormat.format("The answer to {0} is {1}", "everything", 42.asInstanceOf[AnyRef])

  //不返回值
  def box(s: String): Unit = {
    val border = "-" * s.length + "--\n"
    println(border + "|" + s + "|\n" + border)
  }

  //lazy 初始化被延迟至首次取值
  lazy val word = scala.io.Source.fromFile("/usr/leon/sample").mkString

  //exception 有特殊的类型Nothing
  var x = 3
  if (x >= 0) {
    Math.sqrt(x)
    x
  } else throw new IllegalArgumentException("x should be negative")

//  try {
//    scala.io.Source.fromFile("/usr/leon/sample")
//  } catch {
//    case _: MalformedInputException => println("Bad file")
//    case ex: IndexOutOfBoundsException => ex.printStackTrace()
//  } finally {
//    //do something
//  }






}

