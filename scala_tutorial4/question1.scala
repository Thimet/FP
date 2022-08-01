

object question1 extends App{
  
   def flat(amount:Double)= amount match{
     case x if x<=20000 => 0.02
     case x if x>20000 && x<=200000 => 0.04
     case x if x>200000 && x<=2000000 => 0.035
     case x if x>2000000 => 0.065
   }
   
   def actualInterest(amount:Double)={
     amount*flat(amount)
   }
   
   def getDeposit():Double={
     println("Enter deposit: ")
     var c=scala.io.StdIn.readDouble()
     return c
   }
   
   println(actualInterest(getDeposit()))
   
}
