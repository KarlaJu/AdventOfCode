def contador=0
def fileOfStrings = new File("cadenas.txt")

fileOfStrings.eachLine() { line ->
    println line
    cadenaBuena(line)? contador++ : 0
    
}
println(contador)

def singleLine = "aaa"

Boolean cadenaBuena(String cadena) {
  esBuena = false
  //println cadena
  def vocal=0, doble=0 , nocad 
  
  // encontrando vocales
  def vocales = cadena.findAll(~/[aeiuo]/)
  //println vocales.size
  
  // encontrando doble letra
  def dobleLetra = cadena.findAll(~/(.)\1/)
  //println dobleLetra 
  
  //encontrando partes de string
  def noString = cadena.findAll(~/((xy)|(ab)|(cd)|(pq))/)
  //println noString  
//  if(vocales.size()>=3 && dobleLetra && !noString)
//  {
//      esBuena=true
//  }
  
  (vocales.size()>=3 && dobleLetra && !noString) ? (esBuena=true) : "Nothing"
  esBuena
}


//cadenaBuena(singleLine)