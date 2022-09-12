object question3 extends App{

  var ac1=Account(6000) //ac1 eke 6000k tynaw
  var ac2=Account(3000)  //ac2 eke 3000k tynaw
  ac2.transfer(ac1,2000) //ac2 kiynaw, ac1 t 2000k pass karanna kiyla
  ac1.printBalance()
  ac2.printBalance()
}

case class Account(var value:Double){
  
    def transfer(acc:Account,amount:Double)={
        this.value=this.value - amount
        
        acc.value=acc.value+amount
    }
     def printBalance()={
        printf("\nTotal Balance: Rs.%.2f",this.value)
     }
    
 }