def l=[],l2=[],l3=[]
def contadorCadena=0
//String cadena = new File('/Users/makingdevs/Desktop/Programas/Dia5/cadenas.txt').text
String cadena ="""uxcplgxnkwbdwhrp
suerykeptdsutidb
dmrtgdkaimrrwmej"""
/*String cadena= """asdfbxbghyouj
//qwettau
//poitaaxy"""*/

cadena.eachLine{i ->
    def contvoca=0, countigual=0
    def calculo=0, num1=0, num2=0
        
    if(i.contains("a")||i.contains("e")||i.contains("i")||i.contains("o")||i.contains("u"))
    {
        contvoca=contvoca+ i.count("a")
        contvoca=contvoca+ i.count("e")
        contvoca=contvoca+ i.count("i")
        contvoca=contvoca+ i.count("o")
        contvoca=contvoca+ i.count("u")
        println("Numero de vocales: "+contvoca)
        if(contvoca>=3)
        {
        def contdosletr=0
            for(int j=0; j<=i.size()-2;j++)
            {
                if (i[j]==i[j+1]) 
                {
                println("Este es el valor de i: "+i[j]+", este ese el valor siguiente: "+i[j+1])
                    if(i[j]=="a"||i[j]=="b"||i[j]=="c"||i[j]=="d"){
                        println("Cuenta con dos letras iguales: ")
                        countigual++
                        println("Para saber si es igual": +countigual)   
                    }
                    else
                        contdosletr=1                                      
                }
                
            } 
            println("Tiene dos iguales: "+countigual)           
            if(countigual>=1)
            {
            println("Aqui no deberia entrar")
                 for(int j=0; j<=i.size()-2;j++)
                {
                    if( (i[j]=="a" && i[j+1]=="b") || (i[j]=="c" && i[j+1]=="d")||
                    (i[j]=="p" && i[j+1]=="q")||(i[j]=="x" && i[j+1]=="y"))
                    {
                        println("Este es i: "+i[j]+"Este es j+1: "+i[j+1])
                        contdosletr++  
                    }                                       
                                      
                }                       
            }
           if(contdosletr==0)
            {
                contadorCadena++
                println("Este es el contador de cadenas: "+contadorCadena)
            } 
        }
    } 
    println("**********")
}
println(contadorCadena)
