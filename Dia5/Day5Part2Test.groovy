class Day5Part2Test extends GroovyTestCase{

	def day5 = new Day5Part2()

	void testContainsAtLeastAPairOfSameLetters(){
		String text = "qjhvhtzxzqqjkmpb"
		Integer result = day5.verifyIfTheStringIsANiceString(text)
		assert result == 1
	}

	void testTwo(){
		String text = "lelhgursghleus"
		Integer result = day5.verifyIfTheStringIsANiceString(text)
		assert result == 1
	}
}