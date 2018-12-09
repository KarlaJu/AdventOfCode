//String listOfNumbers = new File('/mnt/c/projects/AdventOfCode/2018/Dia1/frecuncy.txt').text
String listOfNumbers = "-1\n-16"

  def sum = 0
	listOfNumbers.eachLine{number ->
  println number 
    sum = sum + number.toInteger()
  }
  println sum
