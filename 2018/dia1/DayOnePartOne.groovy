String listOfNumbers = new File('frecuency.txt').text
//String listOfNumbers = "-1\n-16"

def sum = 0
listOfNumbers.eachLine{number ->
  println number
  sum = sum + (number.toInteger())
  println ("Suma: ${sum}")
}
println "Esta es la total ${sum}"
