

object question2 extends App{
 
   
    def number():Int={
        println("Enter the number: ")
        var c=scala.io.StdIn.readInt()
        return c
    }

    def fun(num:Int):Unit=num match{
       case x if x<= 0 => println("Negative/Zero")
       case x if x%2==0 =>println("EVEN")
       case _ =>println("ODD")
    }
    
    fun(number())
}