package first

object Que03 extends App {
 
  /*def main(args:Array[String])={
     printf("Rs. %.2f ",takeHome(40,30))
  }*/
   printf("Rs. %.2f ",takeHome(40,30))
  
   def OT(h2:Int):Int={  //income of OT hours
     h2*85
   }
   
    def normal(h1:Int):Int={  //income of normal working hours
     h1*250
  }
    
     def income(h1:Int,h2:Int):Int={  //total income
       normal(h1) + OT(h2)
   }
     def tax(h1:Int,h2:Int):Double={  //tax
        income(h1,h2)*0.12
     }
     
     def takeHome(h1:Int,h2:Int):Double={  //take home salary
       income(h1,h2)-tax(h1,h2)
     }
     
     
     
   
}