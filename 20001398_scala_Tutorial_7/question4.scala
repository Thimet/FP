object question4 extends App{
   var accountList:List[Account] = List() //creating the empty list

   def createAccount(N:Int):Unit = {  //creating accounts
        var n=N
        while(n>0){
            println("enter the Account_Id: ")
            var id=scala.io.StdIn.readInt()
            printf("enter the amount you deposit in Acc%d: Rs. ",id)
            var amount=scala.io.StdIn.readDouble()
            val acc=new Account(id)
            accountList=accountList:::acc::Nil
            acc.deposit(amount)
            n=n-1
        }

    }

    val negativeBalance = (accList:List[Account]) => {  //display neagative balance
          val res=accList.filter(acc=>acc.balance < 0.0)
          println(res)
    }

    val sumOfAcc=(accList:List[Account])=> {  //total balance 
           accList.foldLeft(0.0)((x,y)=>x + y.balance)
    }
    
    val interest=(accList:List[Account])=>{  //total interest
         var interestList=accList.map(account =>if(account.balance > 0) account.balance*0.05 else account.balance*0.1)
         interestList.reduce((x,y)=>x+y)
    }

    // val ac1=new Account(1)
    // accountList=accountList:::ac1::Nil
    // ac1.deposit(6000)
    // val ac2=new Account(2)
    // accountList=accountList ::: ac2 :: Nil
    // ac2.deposit(1000)
    // val ac3=new Account(3)
    // accountList=accountList ::: ac3 :: Nil
    // ac3.deposit(7000)

    println("Enter the number of accounts: ") //take input how many accounts are going to be created
    var numOfAcc=scala.io.StdIn.readInt()


    createAccount(numOfAcc) 

    //show account list
    println(accountList)

     //list of negative balances
    negativeBalance(accountList)

    //sum of all account balances
    printf("\nTotal balance without the interest: Rs.%.2f",sumOfAcc(accountList))
    
    //total interest
    printf("\nTotal interest: Rs.%.2f",interest(accountList))

    //final balances of all accounts after apply the interest
    printf("\nFinal total balance with interest: Rs.%.2f",interest(accountList)+sumOfAcc(accountList))
   
}

case class Account(val accId:Int,var balance:Double=0.0){
     
       def deposit(amount:Double) : Unit = {
               this.balance = this.balance + amount
        }
      override def toString = "[Acc_Id:"+accId+",Balance: Rs."+ balance+"]"  
}


