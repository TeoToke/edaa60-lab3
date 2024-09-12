object Helloworld {def main(args: Array[String]): Unit = {
    def hej = println("Hejdå, varld! Jag ska till månen!")
    def start = for (i <- 1 to 10) {hej}
    start
}
}
