//String listOfNumbers = new File('frecuency.txt').text
String listOfNumbers = "-1\n-16"

def vec = []
def vecAux = []
listOfNumbers.eachLine{number ->
  vec = vec + number.toInteger()
  vec.size() == 2 ? vecAux = vecAux + vec.sum() : 0
  if (vec.size() > 2){
    vec = []
    vec = vec + number.toInteger()
  }

}
vecAux.unique().size() == vecAux.size() ? println ("No te sirve") :  println ("Si")
