package first

object Que04 extends App {
 /* def main(args:Array[String])={
    print(profit(5), profit(10), profit(15),
profit(20))
  }*/
  
   def attendees(price:Int):Int={  //to take attendance
     120+(15-price)/5*20
   }
   def revenue(price:Int):Int = { //to calculate revenue
     attendees(price)*price
   }

   def cost(price:Int):Int={  //to calculate cost
     500+attendees(price)
   }

   def profit(price:Int):Int ={  //calculate profit
     revenue(price)- cost(price)
   }
   
    print(profit(5), profit(10), profit(15),profit(20)) 

}