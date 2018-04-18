//def alfa=[]
def l=[],l2=[],l3=[]
def contCad=0, conta=0, contadorCade=0

def coo=[x:[0],y:[0]]
def cadena= """xaabieez
qwer"""

/******Ayuda para crear arreglos
println ('a'..'z')
alfa=('a'..'z')*.bytes.flatten()
println(alfa)****/

cadena.eachLine{i ->
    l<< i//.bytes.collect{it as Integer}
        
    if(i.contains("a")||i.contains("e")||i.contains("i")||i.contains("o")||i.contains("u"))
    {
        def contador=0, cont2=0
        def num1, num2, num
        def a
        //println(a)
        for(int j=0; j<=i.size(); j++)
        {
        //println("Este es el valor del j: "+i[j])
        //println(i[j])
             if(i[j]=="a"||i[j]=="e"||i[j]=="i"||i[j]=="o"||i[j]=="u")
             {
             contador++
             
             //println("el contador: "+contador)    Prueba para imprimir el contador de vocales
             if(contador>=3)
             {
                 for(int w=0; w<=i.size(); w++)
                 {
                        if(i[w]==i[w+1])
                        {
                            cont2++
                            if(cont2==1)
                            {
                            
                                for(int x=0; x<i.size(); x++)
                                {
                                    //l3=l.bytes.flatten()
                                    //println(i[x])
                                    
                                    num1=i[x]
                                    num2=i[x+1] 
                                    //println("El uno: "+num1+" El dos: " +num2)                               
                                    l2=[num1,num2]
                                    l3=l2.bytes.flatten()
                                    println(l3)
                                    if(l3.max()==num1)
                                    {   
                                        num=l3[0]-l3[1]
                                        //println(num)//si se confirma que la cadena tiene una serie de caracteres que no valen
                                        if(num==1)//Entonces no se cuenta
                                        {
                                           conta++ 
                                           //println(conta)
                                        }
                                    }
                                    else
                                    {
                                        num=l3[1]-l3[0]
                                        //println("Este es el numero uno de lo segundo: "+num1+" Este es el numero dos: "+num2)
                                        println(num)
                                        if(num==1)
                                        {
                                           conta++ 
                                           //println(conta)
                                        }
                                    }
                                }
                            }    
                        }
                    }                 
                }
            }   
        }
    } 
    if(conta>0)
    {
        contadorCade++
        
    }

}
println("Prueba"+contadorCade)