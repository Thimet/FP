case class rational(n:Int,d:Int){
    def denom=d
    def nume=n

    def neg=()=>{ 
        if(denom==0){
            printf("\n%d/%d can't be defined, infinity",nume,denom)
        }else if(nume==0){
            printf("\n0")
        }else if(nume<0 && denom<0){
            printf("\n%d/%d",nume,-denom)
        }else if(nume<0){
            printf("\n%d/%d",-nume,denom)
        }else if(denom<0){
            printf("\n%d/%d",nume,-denom)
        }else{
            printf("\n%d/%d",-nume,denom)

        }
    }
}

object question1 extends App{
    var obj1=rational(-1,0)
    obj1.neg()
    var obj2=rational(-1,-2)
    obj2.neg()
    var obj3=rational(-1,2)
    obj3.neg()
    var obj4=rational(1,-2)
    obj4.neg()
    var obj5=rational(10,20)
    obj5.neg()
}

