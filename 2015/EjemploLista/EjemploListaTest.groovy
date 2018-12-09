class EjemploListaTest extends GroovyTestCase{	
	def lista = new EjemploLista()

	void testContainsAtLeastAPairOfSameLetters(){
		String text = "asdfgjwer"
		Integer result = lista.comprobarSiEsUnaBuenaLista(text)
		assert result == 0
	}

	void testTwo(){
		String text = "asdgmymdffdg"
		Integer result = lista.comprobarSiEsUnaBuenaLista(text)
		assert result == 1
	}
	
}
