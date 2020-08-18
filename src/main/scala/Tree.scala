import scala.io.StdIn
import scala.sys.exit

object Tree extends App {
  var Height = 0
  if (args.length == 1) {
    Height = args(0).toInt
  }
  else {
    println("How many lines in your Christmas tree?")
    Height = StdIn.readLine.toInt
  }
  if (Height <= 0) {
    println("Such trees not available")
    exit(1)
  }
  if (Height > 1) println(" " * (Height - 1) + "\ud83c\udf1f") //UTF symbol star 🌟
  else println("\ud83c\udf32") //UTF symbol christmas tree 🌲
  for (currentHeight <- 2 until Height + 1) {
    println(" " * (Height - currentHeight) + "*" * (currentHeight * 2 - 1))
  }


}