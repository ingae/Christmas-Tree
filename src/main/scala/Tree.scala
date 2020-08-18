object Tree extends App {
  val Height = 3
  for (currentHeight <- 1 until Height + 1) {
    println(" " * (Height - currentHeight) + "*" * (currentHeight * 2 - 1))
  }
}