package second

object que05 extends App {
  def easyPace(e:Int):Int=8*e  //minutes for easy pace
  
  def tempo(t:Int):Int=7*t  //minutes for tempo
  
  def total(e1:Int,t:Int,e2:Int):Int={easyPace(e1)+tempo(t)+easyPace(e2)}
  
  println(total(2,3,2)+" MIN")
}