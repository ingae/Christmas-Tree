object Tree extends App {
  val Height = 3
  if (Height > 1) println(" " * (Height - 1) + "\ud83c\udf1f") //UTF symbol star 🌟
  else println("\ud83c\udf32") //UTF symbol christmas tree 🌲
  for (currentHeight <- 2 until Height + 1) {
    println(" " * (Height - currentHeight) + "*" * (currentHeight * 2 - 1))
  }


}