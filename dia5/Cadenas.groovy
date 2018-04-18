def alfa=[]
def l=[],l2=[]
def contCad=0, conta=0
def n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13
def n14, n15, n16, n17
def coo=[x:[0],y:[0]]
def cadena= """xaabieez
qwer"""

println ('a'..'z')

alfa=('a'..'z')*.bytes.flatten()
println(alfa)

cadena.eachLine{i ->
    l<< i.bytes.collect{it as Integer}
        println("_______")
        println(i)
        
        
    if(i.contains("a")||i.contains("e")||i.contains("i")||i.contains("o")||i.contains("u"))
    {
        def contador=0, cont2=0
        int num1=0, num2=0, num
        println(i.size())
        for(int j=0; j<=i.size(); j++)
        {
        println("Este es el valor del j: "+i[j])
             if(i[j]=="a"||i[j]=="e"||i[j]=="i"||i[j]=="o"||i[j]=="u")
             {
             contador++
             //println("el contador: "+contador)
             if(contador>=3)
             {
                 for(int w=0; w<=i.size(); w++)
                 {
                     println ("Este es el valor i: "+i[w]+" este es el valor siguiente "+i[w+1])
                        if(i[w]==i[w+1])
                        {
                            cont2++
                            if(cont2==1)
                            {
                                for(int x=0; x<i.size(); x++)
                                {
                                    
                                    num1=i[x]
                                    num2=i[x+1]
                                    
                                    l2=[num1,num2]
                                    if(l2.max()==num1)
                                    {   
                                        num=num1-num2
                                        println("Este es el numero uno: "+num1+" Este es el numero dos: "+num2)
                                        println(num)
                                        /*if(num!=1)
                                        {
                                            println("Todo bien")
                                        }*/
                                        // println("Este es el numero uno: "+num1+" Este es el numero dos: "+num2)
                                    }
                                    else
                                    {
                                        num=num2-num1
                                        println("Este es el numero uno de lo segundo: "+num1+" Este es el numero dos: "+num2)
                                        println(num)
                                        if(num!=1)
                                        {
                                           conta++ 
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
}