class Day5 {
	Integer verifyIfTheStringIsANiceString(String text){
		Integer contador=0
		text.eachLine() { line ->
		    validationOfNiceString(line)? contador++ : 0
		}
		contador
	}

	def verifyIfTheStringHasAtLeastThreeVowels(String line){
		line.findAll(~/[aeiuo]/)
	}

	def verifyIfTheStringHasAPairOfTheSameLetter(String line){
		line.findAll(~/(.)\1/)
	}

	def verifyIfTheStringDoesNotHaveThisPairsOfLetters(String line){
		line.findAll(~/((xy)|(ab)|(cd)|(pq))/)
	}

	def validationOfNiceString(String line){
		if(verifyIfTheStringHasAtLeastThreeVowels(line).size()>=3 && 
		   verifyIfTheStringHasAPairOfTheSameLetter(line) && 
		   !verifyIfTheStringDoesNotHaveThisPairsOfLetters(line))
				true
		else 
				false
	}
}