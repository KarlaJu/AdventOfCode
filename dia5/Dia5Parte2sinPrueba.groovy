def text = new File("cadenas.txt")
    Integer contador=0
    text.eachLine() { line ->
        validationEveryString(line)? contador++ : 0
    }
    println contador



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
