def alfa=[]
def l=[]
def contCad=0
def n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13
def n14, n15, n16, n17
def coo=[x:[0],y:[0]]
def cadena= """xabwiez
qwer"""

println ('a'..'z')

alfa=('a'..'z')*.bytes.flatten()


cadena.eachLine{i ->
    l<< i.bytes.collect{it as Integer}
        println("_______")
        println(i)
        
        
        if(i.contains("a")||i.contains("e")||i.contains("i")||i.contains("o")||i.contains("u"))
        {
        def contador=0
        println(i.size())
            for(int j=0; j<i.size(); j++)
            {
            //println("Este es el valor del j: "+j)
                 if(i[j]=="a"||i[j]=="e"||i[j]=="i"||i[j]=="o"||i[j]=="u")
                 {
                 //println("el contador: "+contador)
                     
                     contador++
                     if(contador>=3){
                     println("este es i: "+i[j]+" y este es el siguiente: "+i[j+1])
                     if(i[j]==i[j+1]) // falta corregir esta condicional
                     {
                         println("este es i: "+i[j]+" y este es el siguiente: "+i[j+1])
                     }
                     }
                 
                 }   
            }
      }   
}