case class Point(var x:Int,var y:Int){
    def +(that:Point):Point={
       return Point(this.x+that.x,this.y+that.y)
    }

    def move(dx:Int,dy:Int)={
        this.x =this.x + dx
        this.y=this.y + dy
    }

    def distance(x:Int,y:Int):Double={
        return scala.math.sqrt(math.pow(this.x - x,2)+math.pow(this.y-y,2))
    }

    def invert() :Unit = {
        var temp = this.x
        this.x = this.y
        this.y = temp
    }
}

object que1 extends App{
    var x = Point(1,2) //creating objects point type
    var y = Point(4,10)
    
    println(x+y)

    x.move(2,4)
    println(x)

   // var c = a.distance(2,3)
    println( x.distance(2,3))

    x.invert()
    println(x)



}