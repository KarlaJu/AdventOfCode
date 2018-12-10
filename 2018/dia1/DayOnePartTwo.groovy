String listOfNumbers = new File('frecuency.txt').text
//String listOfNumbers = "-1\n-16"

def sum = 0
def resultingFrecuency = []
def loop = true
while(loop){
  listOfNumbers.eachLine{number ->
    sum = sum + (number.toInteger())
    if(resultingFrecuency.contains(sum)) {
     println ("El número que se repite es: ${sum}") 
     loop = false
    }
    resultingFrecuency = resultingFrecuency + sum
  }
  sum = resultingFrecuency[-1]
}

