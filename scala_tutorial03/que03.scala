package second

object que03 extends App{
  def volToSphere(r:Double):Double={(3.14*r*r*r)*4/3}
  
  println(volToSphere(5)+"cm3")
}