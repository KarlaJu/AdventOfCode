def l=[],l2=[],l3=[]
def contdosletr=0, contadorCadena=0
def cadena= """haeggwjzuvuyypxyu
ugknbfddgicrmopn"""

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
        if(contvoca>=3)
        {
            for(int j=0; j<=i.size()-2;j++)
            {
                if (i[j]==i[j+1]) 
                {
                    countigual++                                          
                }
                
            }
            println("What: "+countigual)
            if(countigual>=1)
            {
                for(int w=0; w<=i.size()-2;w++)
                {
                println()
                    num1=i[w]
                    num2=i[w+1]
                    l=[num1,num2]
                    l2=l.bytes.flatten()
                    println(l2)
                    if(l2.max()==num2)
                    { 
                        calculo=l2[1]-l2[0]
                        if(calculo==1)//No va a acontar
                        {
                            contdosletr++ 
                            println("Que onda2: "+contdosletr)  
                        }
                    }
                }
                 if(contdosletr==0)
                {
                    contadorCadena++
                    
                } 
            }          
        }
    }
    println("************************") 
}
println(contadorCadena)