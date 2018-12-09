class Day5Test extends GroovyTestCase{

	def day5 = new Day5()

	void testOfTheFirstNiceString(){
		String text = "aasdfgasggawr"
		Integer result = day5.verifyIfTheStringIsANiceString(text)
		assert result == 1 
	}

	void testOfTheSecondNiceString(){
		String text = "qweas"
		Integer result = day5.verifyIfTheStringIsANiceString(text)
		assert result == 0
	}

	void testOfTheThirdNiceString(){
		String text = "uxcplgxnkwbdwhrp"
		Integer result = day5.verifyIfTheStringIsANiceString(text)
		assert result == 0
	}

	void testOfFirstSomeNiceStrings(){
		String text = """aasdfgasggawr
						 qweas"""
		Integer result = day5.verifyIfTheStringIsANiceString(text)
		assert result == 1
	}

	void testOfSecondSomeNiceStrings(){
		String text = """bbsdfgasggawr
						 qweas"""
		Integer result = day5.verifyIfTheStringIsANiceString(text)
		assert result == 0
	}

	void testOfThirdSomeNiceStrings(){
		String text = """bbsdfgasggawr
						 aasdfgasggawr"""
		Integer result = day5.verifyIfTheStringIsANiceString(text)
		assert result == 1	
	}
}


