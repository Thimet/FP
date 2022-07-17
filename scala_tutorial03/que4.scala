package second

object que4 extends App{
  def shippingCost(books:Int):Double={  //shipping cost
    if(books>=50) {50*3 + (books-50)*0.75}
    else{books*3}
    
  }
  
  def coverPrice(books:Int):Double={books*24.95}  //cover price
  
  def discount(amount:Double):Double={amount*0.4}  //discount
  
  def wholeSaleCost(books:Int):Double={coverPrice(books)-discount(coverPrice(books))+shippingCost(books)}
  
  println("Rs."+wholeSaleCost(60))
}