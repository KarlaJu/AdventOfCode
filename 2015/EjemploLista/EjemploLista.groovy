class EjemploLista {
	def contadorLetra
	Integer comprobarSiEsUnaBuenaLista(String text){
		Integer contador=0
		text.eachLine() { line ->
			validationEveryString(line)? contador++ : 0
		}
		contador
	}


	def verifyIfTheStringContainsAPairOfLettersWhichRepeats(String line){
		line.findAll(~/(.)\1/)
	}

   
   def validationEveryString(String line){
   	if(verifyIfTheStringContainsAPairOfLettersWhichRepeats(line))
				true
		else 
				false
   }
}