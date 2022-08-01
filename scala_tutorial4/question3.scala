

object question3 extends App{
  def toUpper(exp: String): String = {
        exp.toUpperCase();
    }

    def toLower(exp: String): String = {
        exp.toLowerCase();
    }

    def formatNames(name: String, f:(String) => String): String = {
        f(name);
    }
    println(formatNames("Benny", toUpper))
    println(formatNames("Niroshan".substring(0,2), toUpper)+formatNames("Niroshan".substring(2), toLower))
    println(formatNames("Saman", toLower))
    println(formatNames("Kumara".substring(0,1), toUpper)+formatNames("Kumara".substring(1,5), toLower)+formatNames("Kumara".substring(5), toUpper))
}
