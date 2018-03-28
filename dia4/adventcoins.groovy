/*import java.security.MessageDigest;

String a="abcdef"
def x = generateMD5(a)
def generateMD5(String file) {
   MessageDigest digest = MessageDigest.getInstance("MD5")
   file.withInputStream(){is->
   byte[] buffer = new byte[8192]
   int read = 0
      while( (read = is.read(buffer)) > 0) {
             digest.update(buffer, 0, read)
         }
     }
   byte[] md5sum = digest.digest()
   BigInteger bigInt = new BigInteger(1, md5sum)
   bigInt.toString(16).padLeft(32, '0')
}
*/

/*
import java.security.*

String  password = "abcdef"
MessageDigest sha1 = MessageDigest.getInstance("SHA1")
byte[] digest  = sha1.digest(password.getBytes())
System.out.println(new  BigInteger(1, digest).toString(16))*/

/*import java.security.MessageDigest

def msg = 'abcdef609043'

def digest = MessageDigest.getInstance('SHA1').digest(msg.decodeBase64())
def result = new BigInteger(1, digest).toString(16)

println result*/


import java.security.MessageDigest

def cont=0, cont1=2
def a,b
for(int i=0; i<cont1; i++) {

  def a="abcdef609043"
  //cont++
  //def aux=a + String.valueOf(cont)
  def x = generateMD5_A(a)
  def generateMD5_A(String s){
      MessageDigest.getInstance("MD5").digest(s.bytes).encodeHex().toString()
      
  }
}

import java.security.MessageDigest

for (
String a="ckczppom"
def x = generateMD5_A(a)
def generateMD5_A(String s){
    MessageDigest.getInstance("MD5").digest(s.bytes).encodeHex().toString()
}
