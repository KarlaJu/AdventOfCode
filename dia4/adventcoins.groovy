import java.security.MessageDigest

def i
def generateMD5_A(String s){
  MessageDigest.getInstance("MD5").digest(s.bytes).encodeHex().toString()
}

for (i=0; i<=10000000;i++){
    String a="ckczppom" + i
    

    def x = generateMD5_A(a)
    if (x[0..4]=="00000")
    {
    println(i)
    println(x)
    println ("********")
    }
    
}




