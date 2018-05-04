class Day5Part2 {
	Integer verifyIfTheStringIsANiceString(String text){
		Integer contador=0
		text.eachLine() { line ->
			line.eachLine{

			}
		    validationOfNiceString(line)? contador++ : 0
		}
		contador
	}


	def verifyIfTheStringContainsALetterBetweenTwoSameLetters(String line){
		line.findAll(~/(${letra}.${letra})/)
	}

	def verifyIfTheStringContainsAPairOfLettersWhichRepeats(String line){
		line.findAll(~/(\w{2}).*?(\1)/)
	}

   
   def validationEveryString(){
   	if(verifyIfTheStringContainsALetterBetweenTwoSameLetters(line) && 
		   verifyIfTheStringContainsAPairOfLettersWhichRepeats(line))
				true
		else 
				false
   }
}
	def noString
	def letra 
	(97..122).each{
	    letra = ((char)it)
	    noString = line.findAll(~/(${letra}.${letra})/)
	    if(noString.size()>1){
	        if(line.findAll(~/(\w{2}).*?(\1)/)){
	            println line
	        }
	    }
	}
}