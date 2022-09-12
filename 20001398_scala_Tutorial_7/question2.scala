case class rational(n:Int,d:Int){
    def nume=n
    def deno=d

    def -(that:rational):rational={
       if(this.deno==that.deno){
            return rational(this.nume-that.nume,this.deno)
        }else{
            return rational(this.nume*that.deno- that.nume*this.deno,this.deno*that.deno)
        }
    }

   def printVal=()=>{
        if(deno==0){
            printf("\n%d/%d can't be defined, infinity",nume,deno)
        }else if(nume==0){
            printf("\n0")
        }else if(nume<0 && deno<0){
            printf("\n%d/%d",-nume,-deno)
        }else if(nume<0){
            printf("\n%d/%d",nume,deno)
        }else if(deno<0){
            printf("\n%d/%d",-nume,-deno)
        }else{
            printf("\n%d/%d",nume,deno)

        }
   }    
    
}

object question2 extends App{
        var r1= rational(1,-4)
        var r2=rational(1,2)
        val r3=r1-r2
        
        r3.printVal()

        var r4=rational(1,4)
        var r5=r1-r2-r4
        r5.printVal()
}