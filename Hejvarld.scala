object Helloworld {def main(args: Array[String]): Unit = {
    def hej = println("Hej, varld!")
    def start = for (i <- 1 to 10) {hej}
    start
}
}
