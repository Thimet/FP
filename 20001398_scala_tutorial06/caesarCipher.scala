

object caesarCipher extends App {
  
  def decrypt(c:Char,key:Int):Char=c match{ //decrypt function
    
    case c if c.isUpper =>  //checks whether c is upper letter
       if(c.toInt-key < 65)
         (c.toInt-key+26).toChar
       else
         (c.toInt-key).toChar
    case c if c.isLower =>  //checks whether c is lower letter
        if(c.toInt-key < 97) 
         (c.toInt-key+26).toChar
        else
         (c.toInt-key).toChar
       
    case _ =>  (c.toInt-key).toChar //for all other cases

  }
  
//------------------------------------------------------------------------------------------------------------------------------------
  def encrypt(c:Char,key:Int)= c match {  //encrypt function
    
    case c if c.isUpper => (((c+key-65)%26+65).toInt).toChar //checks whether c is upper letter
    case c if c.isLower => (((c+key-97)%26+97).toInt).toChar //checks whether c is lower letter
    case _ => (c.toInt+key).toChar     //for all other cases

     }
  
//------------------------------------------------------------------------------------------------------------------------------------      
      
def cipher(text:String,key:Int,choice:Int,n:Int=0):String={
  
   choice match{
     case 1=>   if(n== text.length()){ //checks whether n reaches to the end of the string
                       return ""  
                 }
   
                 print(encrypt(text(n),key)) //print character by character
    
                 cipher(text,key,choice,n+1) //recursively call itself
     
     case 2=>             
                  if(n==text.length()){  //checks whether n reaches to the end of the string
                	  return ""
                  }
                  
                  print(decrypt(text(n),key))
                  
                  cipher(text,key,choice,n+1)  //recursively call itself 
    }

    
}  

//----------------------------------------------------------------------------------------------------------------------------------
  def takeChoice()={
      print("1)Encrypt\n2)Decrypt")
      println("\nselect one: ");
      var choice=scala.io.StdIn.readInt();
      choice match{
        case 1=>  var encryption:String=scala.io.StdIn.readLine("Enter the string to encrypt: ")
                  print("Enter the key: ")
                  var key:Int=scala.io.StdIn.readInt()
                  cipher(encryption,key,choice)
                  
        case 2=>  var decryption:String=scala.io.StdIn.readLine("Enter the string to decrypt: ")
                  print("Enter the key: ")
                  var key:Int=scala.io.StdIn.readInt()
                  cipher(decryption,key,choice)      
      }
      
  }
  
  takeChoice()
}

