

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

    println(formatNames("Benny", toUpper));
    println(formatNames("Niroshan", toUpper));
    println(formatNames("Saman", toLower));
    println(formatNames("Kumara", toLower));
}