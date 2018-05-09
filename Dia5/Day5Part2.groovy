class Day5Part2 {
	def contadorLetra
	Integer verifyIfTheStringIsANiceString(String text){
		Integer contador=0
		text.eachLine() { line ->
			validationEveryString(line)? contador++ : 0
		}
		contador
	}


	def verifyIfTheStringContainsALetterBetweenTwoSameLetters(String line){
		def letra, sameLetters
		contadorLetra=0
		(97..122).each{
			letra = ((char)it)
			sameLetters=line.findAll(~/(${letra}.${letra})/)
			(sameLetters)? contadorLetra++ : 0
		}
		contadorLetra
	}

	def verifyIfTheStringContainsAPairOfLettersWhichRepeats(String line){
		line.findAll(~/(\w{2}).*?(\1)/)
	}

   
   def validationEveryString(String line){
   	if(verifyIfTheStringContainsALetterBetweenTwoSameLetters(line)>=1 &&
		   verifyIfTheStringContainsAPairOfLettersWhichRepeats(line))
				true
		else 
				false
   }
}