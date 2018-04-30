class Prueba5Testing extends GroovyTestCase{

def helper = new Helper()

	void testVocales(){
		assert helper.encuentrameLasVocalesPerro(true) == true
	}

}

class Helper{

}